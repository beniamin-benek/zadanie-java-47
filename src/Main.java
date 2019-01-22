import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        LineChecker lineChecker = new LineChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Odcinek pierwszy, punkt startowy:");
        System.out.print("x = ");
        double x1 = scanner.nextDouble(); scanner.nextLine();
        System.out.print("y = ");
        double y1 = scanner.nextDouble(); scanner.nextLine();

        System.out.println("Odcinek pierwszy, punkt końcowy:");
        System.out.print("x = ");
        double x2 = scanner.nextDouble(); scanner.nextLine();
        System.out.print("y = ");
        double y2 = scanner.nextDouble(); scanner.nextLine();

        //punkt pierwszy
        Point start1 = new Point(x1,y1);
        Point end1 = new Point(x2,y2);

        System.out.println("Odcinek drugi, punkt startowy:");
        System.out.print("x = ");
        double x3 = scanner.nextDouble(); scanner.nextLine();
        System.out.print("y = ");
        double y3 = scanner.nextDouble(); scanner.nextLine();

        System.out.println("Odcinek drugi, punkt końcowy:");
        System.out.print("x = ");
        double x4 = scanner.nextDouble(); scanner.nextLine();
        System.out.print("y = ");
        double y4 = scanner.nextDouble(); scanner.nextLine();
        scanner.close();

        //punkt drugi
        Point start2 = new Point(x3,y3);
        Point end2 = new Point(x4,y4);

        //odcinki
        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);

        System.out.printf("\nOdcinek 1:\n- punkt początkowy: (%f, %f)\n- punkt końcowy: (%f, %f)\n", line1.getStart().getA(), line1.getStart().getB(), line1.getEnd().getA(),line1.getEnd().getB());
        System.out.println("- długość: : " + lineChecker.returnLength(line1));
        System.out.printf("Odcinek 2:\n- punkt początkowy: (%f, %f)\n- punkt końcowy: (%f, %f)\n", line2.getStart().getA(), line2.getStart().getB(), line2.getEnd().getA(),line2.getEnd().getB());
        System.out.println("- długość: " + lineChecker.returnLength(line2) + "\n");

        //porównanie:
        if (lineChecker.returnLonger(line1,line2) == line1)
            System.out.println("Odcinek 1 jest dłuższy.");
        else if (lineChecker.returnLonger(line1,line2) == line2)
            System.out.println("Odcinek 2 jest dłuższy.");
        else
            System.out.println("Oba odcinki mają równą długość.");
    }

}