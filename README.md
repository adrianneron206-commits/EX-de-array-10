# ejercicio arrays 10.

```
INICIO

DEFINIR a COM ARRAY DE 5 ENTERS
DEFINIR b COM ARRAY DE 5 ENTERS
DEFINIR resultat COM ARRAY DE 5 ENTERS
DEFINIR i COM ENTER

PER i DES DE 0 FINS A 4
ESCRIURE "Introdueix un número per a"
LLEGIR a[i]
FI_PER

PER i DES DE 0 FINS A 4
ESCRIURE "Introdueix un número per b"
LLEGIR b[i]
FI_PER

PER i DES DE 0 FINS A 4
resultat[i] ← a[i] + b[i]
FI_PER

ESCRIURE "Array a:"
PER i DES DE 0 FINS A 4
ESCRIURE a[i]
FI_PER

ESCRIURE "Array b:"
PER i DES DE 0 FINS A 4
ESCRIURE b[i]
FI_PER

ESCRIURE "Array resultat:"
PER i DES DE 0 FINS A 4
ESCRIURE resultat[i]
FI_PER

FI
```

| Índice i | a[i] | b[i] | resultat[i] |
|----------|------|------|-------------|
| 0        | 1    | 5    | 6           |
| 1        | 2	    | -2   | 0           |
| 2        | 3    | 0    | 3           |
| 3        | 4    | 6    | 10          |
| 4        | 5    | 1    | 6           |