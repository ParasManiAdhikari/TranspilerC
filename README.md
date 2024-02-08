# TRANSPILER + INTERPRETER
## The assembly code is called P-code see image below.
## C code -> P-Code     .using Transpiler
## Run P-Code           .using Interpreter
### This is a p-code generation project made with Java that uses ANTLR grammar. 
C code is translated into P-code ( almost assembly) for a virtual machine (VM).
[TASK IN DETAIL](https://github.com/parasxdhikari/CompilerC/blob/main/CompilerQuestion.md)
- The source code is Cymbol which is a dumbed down version of C.
- The target code is Pcode which is very similar to assembly.
- To simplify intermediate code generation, StringTemplate is used!
- Unit Tests are included.
- Also includes the answer for this [DSL AFSM Task](https://github.com/parasxdhikari/CompilerC/blob/main/DSLAutomaten.md) 
  
## Example
![image](https://github.com/parasxdhikari/CompilerC/assets/88732757/031430e7-dcd6-495f-a8b5-cfbca188f001)

### Converts to:
![image](https://github.com/parasxdhikari/CompilerC/assets/88732757/165f3516-ae95-414f-b175-4af15596d110)

[Main Listener File](https://github.com/parasxdhikari/CompilerC/blob/main/src/main/java/zwischencode/Listener.java)
