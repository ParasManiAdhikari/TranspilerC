## Aufgabe 1

### 1. Syntax driven Definition

```
prog.val = stat.val
stat.val = expr1.val
expr.val = int.val
expr.val = expr1.val + expr2.val
expr.val = expr1.val - expr2.val
expr.val = expr1.val * expr2.val
expr.val = expr1.val / expr2.val
expr.val = ( expr.val )

```
### 2. 
Das val attribut ist synthetisiert, da sein Wert vorhanden ist
   abgeleitet von den Werten der Attribute in den untergeordneten Elementen des entsprechenden
   nichtterminal im Analysebaum während einer Bottom-Up-Traversierung.
### 3. 
Die syntaxgesteuerte Definition ist S- attributiert, da alle Attribute synthetisiert sind.
### 4. Annotierte Baum

#### 9-5+2
```
       prog (6)
     /     \
  stat (6    n
  /       \
expr(4) +   int
/       \      \
int  - int      2
|        |
9        5

```

#### 9-5*2

```
       prog (6)
     /     \
  stat (6    n
  /       \
expr(10) -   int
/       \      \
int  * int      
|        |
5        2
```

### 5. Translation Schema
```
S -> prog { int result}
prog -> stat { result = stat.result }
stat -> expr n | n { result = expr.result }
expr -> INT { result = INT.result }
expr -> expr + expr { result = expr_1.result + expr_2.result }
expr -> expr - expr { result = expr_1.result - expr_2.result }
expr -> expr * expr { result = expr_1.result * expr_2.result }
expr -> expr / expr { result = expr_1.result / expr_2.result }
expr -> ( expr ) { result = expr.result }
```

f
annotierte baum????



