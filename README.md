# TDT4250-Group02

## OPEN TO-DOs
* README
	* Describe the models in Model section
	* Extend Usage section by explaining how to run the transitions
* Model-to-Model-Transition
	* It is possible that the code lines we are "generating" are invalid due to multiple variables having the same name. We need a fix for this
	* Imports are missing!
	* When generating the request body, the " are not being escaped properly and are therefore not present! -> Can't compile the resulting java class
* Model-to-Text transition
	* How could we trigger this workflow from java code e.g. inside the TestSuiteConverter class?
	* Why are we generating so many empty lines?
* Sirius
	* Is it working?

## Description
Our project is about generating java unit tests. This repository contains an eclipse plugin which can automatically generate test code for a web API. The test cases are specified as a sequence of REST requests, containing all the necessary information to execute the given HTTP requests, including parameters, headers and expected response codes. Further information on the data structures can be seen in the [Models section](#Models).

## Usage
The test code generation can be triggered in different ways.
1. **A Model-to-Model transition**; starting from a [TestSuite](#testsuite-model) specification file, containing all the use cases in JSON format. This is done by running the TestSuiteConverter java class, located in the transitions/src/modeltomodel package, which performs the transformation.
2. **A Model-to-Text transition**; starting from a model of the to be generated java test class, conforming to the [JavaTestModel](#javatestmodel). This transition is done by running the generateJavaCode mtl file, which is located in the transitions/src/model2text package. 
[comment]: <> (should we explain run configurations? we probably should right)

## Models

#### TestSuite Model

![TestSuite UML diagram](img/testsuiteUML.png)

#### JavaTestModel

![JavaTest UML diagram](img/javatestUML.png)

Validations:
- `TestClass` `name` attribute must be a valid java identifier and the first letter must be capitalized
- `TestClass` `package` name must be a valid java package name 
- `TestClass` `imports` must start with import and end with a semicolon
- `Method` `annotations` must start with @ and be a valid java identifier
- `Method` `name` must be a valid java identifier and the first letter must be lowercase

## Project Context
This repository is the results of the project in the course TDT4250 Advanced Software Design at the Norwegian University of Science and Technology in 2022.

## Authors
Davide Aimar, 
Gaute Brandser, 
Martin Mayr, 
Richard Zahn
