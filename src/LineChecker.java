import static java.lang.Math.*;

class LineChecker {

    double returnLength(Line line) {
        return abs(sqrt(pow(line.getStart().getA() - line.getEnd().getA(),2) + pow(line.getStart().getB() - line.getEnd().getB(),2)));
    }

    Line returnLonger (Line line1, Line line2) {

        if (returnLength(line1) > returnLength(line2))
            return line1;
        else if (returnLength(line1) < returnLength(line2))
            return line2;
        else
            return null;
    }

}