void main() {

    java.util.Scanner lector = new java.util.Scanner(System.in);

    int [ ] a = new int[5];
    int [ ] b = new int[5];
    int [ ] resultat = new int[5];
    int i;

    for (i = 0; i <= 4; i++) {
        System.out.println("Introdueix un número per a");
        a[i] = lector.nextInt();
    }

    for (i = 0; i <= 4; i++) {
        System.out.println("Introdueix un número per b");
        b[i] = lector.nextInt();
    }

    for (i = 0; i <= 4; i++) {
        resultat[i] = a[i] + b[i];
    }

    System.out.println("Array a:");
    for (i = 0; i <= 4; i++) {
        System.out.println(a[i]);
    }

    System.out.println("Array b:");
    for (i = 0; i <= 4; i++) {
        System.out.println(b[i]);
    }

    System.out.println("Array resultat:");
    for (i = 0; i <= 4; i++) {
        System.out.println(resultat[i]);
    }
}
