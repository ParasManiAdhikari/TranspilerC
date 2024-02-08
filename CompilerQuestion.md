# Syntaxgesteuerte Zwischencodeerzeugung (1AP)
## Aufgabe
Entwickeln Sie einen Compiler,
der Quell-Code in Ziel-Code für eine Virtuelle Maschine (VM) übersetzt.
Quellsprache und Zielsprache können Sie aus den unten genannten Varianten wählen.
 
Verwenden Sie zur Vereinfachung der Zwischencodegenerierung **StringTemplate**!

Idealerweise sollte Ihr Compiler in der Lage sein,
den Quell-Code in Zwischencode für eine andere Virtuelle Maschine zu übersetzen,
indem Sie einfach die Templates für den Ziel-Code austauschen.
### Test
Testen Sie Ihren Compiler wie folgt:

Für jedes beiliegende Beispielprogramm der Quellsprache
1. Übersetzen des Programms in Zielsprache 
2. Ggf. Assemblieren des übersetzten Programms in ausführbaren Code (bei Jasmin u. LLVM)
3. Interpretation des übersetzten Programms mit der jeweiligen Virtuellen Maschine!
4. Überprüfen der Ausgaben des interpretierten Programms auf Korrektheit!
Automatisieren Sie diesen Ablauf mit einem **Parametrized** JUnit-Test!
### CI-Pipeline
Erstellen Sie eine CI-Pipeline, die den Test ausführt.
### Vorbereitung
Studieren Sie die Einleitung des Kapitels 10 „Building Bytecode Interpreters“ und
den Abschnitt 10.1 „Programming Bytecode Interpreters“ (S. 239 bis S. 243) im PATTERN-Buch.
## Quell-Code-Varianten
(Wer Cymbol wählt, braucht im nächsten Praktikum den Teil „Externe DSL“ nicht zu bearbeiten.)
### Variante 1: Clobal (7VP)
Die beiliegende Grammatik [Clobal.g4](Clobal.g4) beschreibt die Syntax der Sprache Clobal (ohne Lexer).

Das Token FORMAT können Sie folgt im Lexer definieren; FORMAT: '"%d\\n"'

Der Grammatik können Sie entnehmen,
dass es in Clobal ausschließlich globale Variablen gibt.
Es können keine lokalen Variablen und auch keine Funktionsparameter vereinbart werden.
Somit haben Clobal-Programme nur einen globalen Gültigkeitsbereich für Variablen,
der mit einer sehr einfachen Symboltabelle (Map) verwaltet werden kann.
Ansonsten ist Clobal eine Untermenge von C99.

[Clobal-Programme für den JUnit-Test](ClobalProgs.zip)
### Variante 2: Cymbol (12VP) 
Die beiliegende Grammatik [Cymbol.g4](Cymbol.g4) beschreibt die Syntax der Sprache Cymbol (ohne Lexer).
Der Grammatik können Sie entnehmen,
dass es in Cymbol neben globalen Variablen auch lokale Variablen und Funktionsparameter gibt.
Damit können Cymbol-Programme mehrere verschachtelte Gültigkeitsbereiche haben,
zu deren Verwaltung eine komplexere Symboltabelle erforderlich ist.

Sie müssen sich somit intensiv mit der Symboltabellenverwaltung auseinandersetzen.
Code für eine geeignete Symboltabellenverwaltung finden Sie im ANTLR4-Buch im Kapitel 8.4 „Validating Symbol Usage“ auf S.138.

Cymbol ist eine Obermenge von Clobal und eine Untermenge von C99.
Ihr Cymbol-Compiler muss somit nicht nur Cymbol-,
sondern auch Clobal-Programme in Zwischencode übersetzen können!

[Clobal-Programme für den JUnit-Test](ClobalProgs.zip)

[Cymbol-Programme für den JUnit-Test](CymbolProgs.zip)
## Ziel-Code-Varianten
(Wer R-Code oder LLVM-IR wählt,
braucht im nächsten Praktikum den Teil „DSL-Services“ nicht zu bearbeiten.)
### Variante 1: P-Code 
P-Code ist Code für den im Pattern 27 beschriebenen Stack-basierten Bytecode-Interpreter. 
Beschreibungen des Codes und der zugehörigen VM finden Sie im Abschnitt 10.2 „Defining an Assembly Language Syntax“ auf S. 243 und im Pattern 27 „Stack-Based Bytecode Interpreter“ ab S. 259.

For your convenience: [Stack-Interpreter](StackInterpreter.zip)
### Variante 2: Jasmin (+3VP)
Informationen zu Jasmin finden Sie unter jasmin.sourceforge.net.
Hinweis: Der Compiler muss Jasmin-Code für eine äußere Klasse mitgenerieren. 
### Variante 3: R-Code (+6VP)
R-Code ist Code für den im Pattern 28 beschriebenen Register-basierten Bytecode-Interpreter.

Beschreibungen des Codes und der zugehörigen VM finden Sie Abschnitt 10.2 „Defining an Assembly Language Syntax“ auf S. 243 und im Pattern 28 „Register-Based Bytecode Interpreter“ ab S. 267.

For your convenience: [Register-Interpreter](RegisterInterpreter.zip)
### Variante 4: LLVM-IR (+8VP)
Informationen zur LLVM-Zwischensprache (LLVM-IR) finden Sie unter llvm.org.

Übersetzen Sie zusätzlich alle Beispielprogramme in LLVM-IR mit Clang
und analysieren Sie den generierten LLVM-Zwischencode.
Hinweise zu den notwendigen Kommandozeilenargumenten von Clang
finden Sie [hier](https://stackoverflow.com/questions/9148890/how-to-make-clang-compile-to-llvm-ir).

Ihr eigener Compiler ist dann so etwas wie ein Mini-Clang.

