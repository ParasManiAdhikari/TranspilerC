# Domänenspezifische Sprachen für Endliche Automaten (1AP)
### Abkürzungen
- FSM:		Finite-State Machine
- **A**FSM:		**Acceptor** Finite-State Machine -- Das sind die **Akzeptoren** aus der Vorlesung (ohne Aktionen!).
- **A**FSML: 	**Acceptor** Finite-State Machine Language
- DSL: 		Domain-Specific Language
## 1. Interne DSL 
### 1.1 Objektmodell (1VP)
Studieren Sie Abschnitt 2.2.1 „Baseline Object Model“ ab S.54 im Software-Languages-Buch.

Welcher spezielle Typ eines Deterministischen Endlichen Automaten wird im Buch modelliert?
(Zur Not nochmal das Skript zu Informatik I konsultieren.)

Entwickeln Sie ein Objektmodell für AFSMs.
Sie können das Baseline Object Model für FSMs (Illustration 2.5) als Ausgangsbasis verwenden. 
### 1.2 Fluent API (1VP)
Studieren Sie Abschnitt 2.2.2 „Fluent API“ ab S.57 im Software-Languages-Buch.

Entwickeln Sie eine Fluent API für AFSMs.
Sie können die Fluent API für FSMs (Illustration 2.8) als Ausgangsbasis verwenden.
### 1.3 Implementation der Fluent API (1VP)
Implementieren Sie Ihre Fluent API auf Ihrem Objektmodell.
Sie können Ihr erstes Objektmodell ggf. noch anpassen und weiterentwickeln.

Erzeugen Sie mit Ihrer Fluent API Objektmodelle für mindestens drei AFSMs. 
### 1.4 Interpreter (1VP)
Studieren Sie Abschnitt 2.2.3 „Interpretation“ ab S.61 im Software-Languages-Buch.

Programmieren Sie einen Interpreter zur Simulation von AFSMs,
die mit Ihrer Fluent API erzeugt werden.

Schreiben Sie einen JUnit-Test,
der den Interpreter für mindestens drei Automaten testet. 
## 2. Externe DSL
(Wer im vorherigen Praktikum Cymbol übersetzt hat, muss diesen Teil nicht bearbeiten.)
### 2.1 AFSML: Externe DSL für AFSMs (1VP)
Studieren Sie die Abschnitte 2.3.1 „Syntax Definition“ und
2.3.2 „Syntax Checking“ ab S.67 im Software-Languages-Buch.

Entwickeln Sie eine externe DSL für AFSMs.
Im Folgenden nennen wir diese Sprache AFSML.
Sie können die FSML (Illustration 2.17) als Ausgangsbasis verwenden. 
### 2.2 Parser für AFSML (1VP)
Studieren Sie Abschnitt 2.3.3 „Parsing“ ab S. 71 im Software-Languages-Buch.

Programmieren Sie mit ANTLR einen Parser für Ihre AFSML.
Als Resultat soll der Parser AFSMs in Ihrem Objektmodell erzeugen (siehe Illustration 2.21).
## 3. DSL-Services
(Wer im vorherigen Praktikum 3AC generiert hat, muss diesen Teil nicht bearbeiten.)
### 3.1 Austauschformat für Import und Export (VPs siehe unten)
Studieren Sie Abschnitt 2.4.1 „Interchange Format“ ab S. 74 im Software-Languages-Buch.

Wählen Sie eines der unten gelisteten Dateiformate und
entwickeln Sie ein mit diesem Dateiformat kompatibles Austauschformat für AFSMs.

Programmieren Sie mit ANTLR einen Parser,
der AFSMs vom Austauschformat in das AFSM-Objektmodell importiert und
mit StringTemplate einen Generator,
der AFSMs vom Objektmodell in das Austauschformat exportiert.
### 3.2 Code Generierung (2VP)
Studieren Sie Abschnitt 2.4.2 „Code Generation“ ab S. 76 im Software-Languages-Buch.

Programmieren Sie mit StringTemplate einen Code-Generator,
der AFSMs vom Objektmodell in C-Code mit guter Laufzeit- und Speichereffizienz überführt.
### 3.3 Visualisierung (2VP)
Studieren Sie Abschnitt 2.4.3 „Visualization“ ab S. 82 im Software-Languages-Buch.

Programmieren Sie mit StringTemplate einen Generator,
der AFSMs vom Objektmodell in eine Graphviz/DOT-Datei überführt.
## Dateiformate
### CSV (3VP)
Hinweise für die Konstruktion eines CSV-Parsers mit ANTLR finden Sie
im Kapitel 6.1 „Parsing Comma-Separated Values“ ab S. 84 und
im Kapitel 8.1 Loading „CSV Data“ ab S. 127 des ANTLR4-Buchens 
### JSON (5VP)
Hinweise für die Konstruktion eines JSON-Parsers mit ANTLR finden Sie
im Kapitel 8.2 „Translating JSON to XML“ ab S. 130 des ANTLR4-Buches.
### XML (7VP)
Hinweise für die Konstruktion eines XML-Parsers mit ANTLR finden Sie
im Kapitel 12.4 „Parsing and Lexing XML“ ab S. 224 des ANTLR4-Buches.
Hinweise zur Generierung von XML finden Sie im Kapitel 8.2 „Translating JSON to XML“ ab S. 130 im ANTLR4-Buch.
