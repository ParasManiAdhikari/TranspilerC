# TRANSPILER + INTERPRETER
#### The assembly code is called P-code see image below.
## C code -> P-Code ------ using Transpiler
## Run P-Code ------------ using Interpreter
#### This is a p-code generation project made with Java that uses ANTLR grammar. 
#### C code is translated into P-code ( almost assembly) for a virtual machine (VM). The process is called intermediate code generation.
- [TASK IN DETAIL](https://github.com/ParasManiAdhikari/TranspilerC/blob/main/CompilerQuestion.md)
- The source code is Cymbol which is a dumbed down version of C.
- The target code is Pcode which is very similar to assembly.
- To simplify intermediate code generation, StringTemplate is used!
- Unit Tests are included.
- Also includes the answer for this [DSL AFSM Task](https://github.com/ParasManiAdhikari/CompilerC/blob/main/DSLAutomaten.md) 
  
## Example
![image](https://github.com/ParasManiAdhikari/TranspilerC/assets/88732757/9ae2b0c4-ea5a-41d7-a8d5-bfeee03c9550)


### Converts to:
![image](https://github.com/ParasManiAdhikari/TranspilerC/assets/88732757/834d80bd-dac8-4a1b-b632-423b1a94cf01)


[Main Listener File](https://github.com/ParasManiAdhikari/CompilerC/blob/main/src/main/java/zwischencode/Listener.java)
