package m2mtransition.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DependencyHandler {
	private final List<String> imports;
	
	public DependencyHandler() {
		this.imports = new ArrayList<>();
	}
	
	public void addDependency(String packageName) {
		String importStatement = "import " + packageName;
		if (!imports.contains(importStatement)) {
			imports.add(importStatement);			
		}
	}
	
	public void addStaticDependency(String packageName) {
		String importStatement = "import static " + packageName;
		if (!imports.contains(importStatement)) {
			imports.add(importStatement);
		}
	}
	
	public List<String> getImportStatements() {
		// if we have 5 imports of the same package, then replace these 5 imports with one .* import
		
		// get the library names		
		List<String> libs  = new ArrayList<>();
		
		for (int i = 0; i < imports.size(); ++i) {
			int ii = imports.get(i).lastIndexOf('.'); 
			String[] a =  {imports.get(i).substring(0, ii), imports.get(i).substring(ii+1)};
			libs.add(a[0]);
		}
		
		for (int i = 0; i < libs.size(); ++i) {
			String current = libs.get(i);
			int occurences = Collections.frequency(libs, current);
			// check which library name occurs more than 4 times
			if (occurences >= 5) {
				// remove the packages from imports
				imports.removeIf(s -> (s.contains(current)));
			
				// add the alternate notation to imports
				imports.add(current + ".*");
				
				// remove all libs with equal names
				libs.removeIf(s -> (s.equalsIgnoreCase(current)));
			}
		}
		
		return imports;
	}
}
