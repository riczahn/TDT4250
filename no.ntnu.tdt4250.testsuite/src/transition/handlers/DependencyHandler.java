package transition.handlers;

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
		imports.add(importStatement);	
	}
	
	public void addStaticDependency(String packageName) {
		String importStatement = "import static " + packageName;
		imports.add(importStatement);
	}
	
	public List<String> getImportStatements() {
		// TODO: Test this
		// if we have 5 imports of the same package, then replace these 5 imports with one .* import
		
		// get the library names		
		List<String> libs  = new ArrayList<>();
		for (int i = 0; i < imports.size(); ++i) {
			int ii = imports[i].lastIndexOf('.'); 
			String[] a =  {imports[i].substring(0, ii), imports[i].substring(ii+1)};
			libs.add(a);
		}		
		
		for (int i = 0; i < libs.size(); ++i) {
			int occurences = Collections.frequency(libs, libs[i])
			// check which library name occurs more than 4 times
			if (occurences >= 5) {
				// remove the packages from imports
				imports.removeIf(s -> (s.contains(libs[i]))));
				
				// add the alternate notation to imports
				imports.add(libs[i] + ".*");
				
				// remove all libs with equal names
				libs.removeIf(s -> (s.equalsIgnoreCase(libs[i])));
			}
		}
		
		return imports;
	}
}
