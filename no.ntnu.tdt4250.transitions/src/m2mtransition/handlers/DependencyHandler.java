package m2mtransition.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DependencyHandler {
	private final Set<String> imports;
	
	public DependencyHandler() {
		this.imports = new HashSet<>();
	}
	
	public void addDependency(String packageName) {
		String importStatement = "import " + packageName;
		imports.add(importStatement);			
	}
	
	public void addStaticDependency(String packageName) {
		String importStatement = "import static " + packageName;
		imports.add(importStatement);
	}
	
	public Set<String> getImportStatements() {
		List<String> dependentPackages = getDependentPackages();
		Set<String> ret = new HashSet<>();
		
		for(String dependency : imports) {
			String packageName = extractPackageName(dependency);
			int numberOfReferences = Collections.frequency(dependentPackages, dependency);
			
			if (numberOfReferences >= 3) {
				ret.add(packageName + ".*");
			} else {
				ret.add(dependency);
			}
		}
		
		return imports;
	}
	
	private List<String> getDependentPackages() {
		List<String> dependentPackages  = new ArrayList<>();
		
		for(String dependency : imports) {
			String packageName = extractPackageName(dependency);
			dependentPackages.add(packageName);
		}
		
		return dependentPackages;
	}
	
	private String extractPackageName(String dependency) {
		int lastDot = dependency.lastIndexOf('.');
		return dependency.substring(0, lastDot);
	}
}
