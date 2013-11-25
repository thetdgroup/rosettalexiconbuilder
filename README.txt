To build the java classes representing the xsd schema we use the apache xml bean project that will 
compile a schema into XML Bean classes and metadata

Explanation of below:
Given an xsd the project will generate a jar file that we can then use to create an xml document that is represented by the xsd 
See http://xmlbeans.apache.org/ to get yourself the project

Windoze:
scomp C:\Users\edamphousse\Workspaces\"MyEclipse 9"\RosettaLexiconBuilder\src\reference_schema\rosetta.dictionary.xsd \
-out RosettaTerminology.jar \
-compiler C:\MyEclipse-8.6\Genuitec\Common\binary\com.sun.java.jdk.win32.x86_64_1.6.0.013\bin\javac.exe \
-out C:\Users\edamphousse\Workspaces\"MyEclipse 9"\RosettaLexiconBuilder\lib\RosettaTerminology.jar \
-src C:\Users\edamphousse\Workspaces\"MyEclipse 9"\RosettaLexiconBuilder\src

Linux:
scomp /Users/ericdamphousse/Workspaces/"MyEclipse 9"/RosettaLexiconBuilder/src/reference_schema/rosetta.dictionary.xsd  \
-out RosettaTerminology.jar \
-compiler javac \
-out /Users/ericdamphousse/Workspaces/"MyEclipse 9"/RosettaLexiconBuilder/lib/RosettaTerminology.jar \
-src /Users/ericdamphousse/Workspaces/"MyEclipse 9"/RosettaLexiconBuilder/src
