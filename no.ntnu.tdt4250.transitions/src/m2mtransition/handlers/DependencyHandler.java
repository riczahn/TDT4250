package m2mtransition.handlers;

import java.util.ArrayList;
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
		// TODO: Here we could do some smart logic like
		// if we have 5 imports of the same package, then replace these 5 imports with one .* import
		return imports;
	}
}
