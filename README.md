# Java Tests Generator

## Description
This project is about generating java unit tests. This repository contains eclipse plugins which can automatically generate test code for a web API. The test cases are specified as a sequence of REST requests, containing all the necessary information to execute the given HTTP requests, including parameters, headers and expected response codes. Further information on the data structures can be seen in the [Models section](#Models). The input of our program is a specification of a test suite, that is a json file automatically generated by a software analyzing production data. An example of such a file is:

```json
{
  "testSteps": [
    {
      "headers": {
        "Accept": "application/json",
        "Authentication": "dGVzdHVzZXI6cGFzc3dvcmQ=",
        "Content-Type": "application/json"
      },
      "method": "post",
      "assertions": {
        "successfulCodes": [
          202
        ]
      },
      "body": "{\"properties\":{\"location\":\"us/las\"}}",
      "uri": "https://api.ionos.com/cloudapi/v5/datacenters?pretty=true&depth=0"
    },
    {
      "headers": {
        "Accept": "application/json",
        "Authentication": "dGVzdHVzZXI6cGFzc3dvcmQ="
      },
      "method": "get",
      "inferrableParameters": [
        {
          "name": "datacenterId",
          "jsonPath": "id",
          "testStepId": 1,
          "parameterLocation": "path"
        }
      ],
      "assertions": {
        "successfulCodes": [
          200,
          202
        ]
      },
      "uri": "https://api.ionos.com/cloudapi/v5/datacenters/{datacenterId}?pretty=true&depth=0"
    }
  ]
}
```

Our goal is to generate a java class from this file, containing the unit tests. Other than that we also implemented a Sirius editor for the test suite model, to allow users to create, visualize and edit tests in a graphical interface.

## Usage
The test code generation can be triggered in different ways, depending on the state of the input.
1. **A Model-to-Model transition**; starting from a [TestSuite](#testsuite-model) specification file in xmi format. This is done by running the TestSuiteConverter java class, located in the transitions/src/model2model package, which performs the transformation. This class runs a whole stack of java classes, together building the java test model. To run the transformation, you need to run the TestSuiteConverter as a Java application, specifying the input file and the output file as arguments. An example configuration using the test files that are in this repository is:<br>
![Model to Model configuration](img/m2m-conf.png)<br>
2. **A Model-to-Text transition**; starting from a model of the to be generated java test class, conforming to the [JavaTestModel](#javatest-model). This transition is done by running the generateJavaCode mtl file, which is located in the transitions/src/model2text package. This transforms the model to an actual Java class. To run the transformation, you need to run the TestSuiteConverter as an acceleo application, use these files for an example run: <br>
![TestSuite UML diagram](img/m2t-conf.png)<br>
3. **A json-to-model transition**; starting from the input json file, it's possible to transform it to an instance of the [TestSuite](#testsuite-model) model. This is done by running the LoadTestSuite Java class located in transitions/src/json2model. To run the transformation, you need to run the TestSuiteConverter as a Java application, specifying the input file and the output file as arguments. If no arguments, there is a default which runs the transformation on one of our examples. An example configuration using the test files that are in this repository is below.:<br>
![Json to model configuration](img/json2m-conf.png)<br>
4. **A json-2-java transition**; starting from the input json file, it's possible to transform it to an actual java class, running all the intermediate steps at once. This is done by running the JsonToJavaConverter Java class located in transitions/src/json2java. To run the transformation, you need to run the it as a Java application, specifying the input file and the output file as arguments. Without arguments, it runs an example of ours. An example configuration using the test files that are in this repository is (pay attention to the output path, it's a folder and not a file since Acceleo will name the file by itself):<br>
![Json to java configuration](img/json2java-conf.png)<br>

### Sirius 
It's possible to manage instances of the Testsuite Model using a graphical interface made with Sirius. To do so run the `no.ntnu.tdt4250.design` as an Eclipse Application and open the `no.ntnu.tdt4250.demo` plugin. Here there is an example of a TestSuite instance as a xmi file, click on the arrow and open the `TestSuitediagram` viewpoint as shown here:

![First step for Sirius](img/sirius-0.png)

It will open a graphical interface in which it's possible to see every TestCase for the selected TestSuite. In this viewpoint it's possible to:
- show/hide the TestSuite by selecting/deselecting the layer `TestSuite`
- add TestCases by dragging the `TestCase` element from the sidebar to the diagram
- add TestSteps (APIRequests) by dragging the `ApiRequest` element from the sidebar inside a `TestCase`
- edit the attributes of the TestCase by clicking on the element and editing the attributes in the properties view
- edit the attributes of the TestStep by clicking on the element and editing the attributes in the properties view

![Second step for Sirius](img/sirius-1.png)

By double clicking on a TestStep, it's possible to open the `TestStep` viewpoint, which shows the TestStep in a more detailed way. In this viewpoint it's possible to:
- show/hide the Headers and Parameters by selecting/deselecting the layers `Headers` and `Parameters`
- add Headers and Parameters by dragging the `createHeader` and `createParameter` elements from the sidebar to the diagram
- edit the attributes of the Header and Parameter by clicking on the element and editing the attributes in the properties view
- edit the attributes of the TestStep by clicking on the element and editing the attributes in the properties view
- add and edit Assertions. To add an assertion, drag the `createAssertion` element from the sidebar to the TestStep. To edit an assertion, click on it and edit the attributes in the properties view

![Third step for Sirius](img/sirius-2.png)

## Models

#### TestSuite Model

![TestSuite UML diagram](img/testsuiteUML.png)

#### JavaTest Model

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
