public class Main {
    public static void main(String[] args) {
        int[] grades = LabAssignment1.loadGradesFromFile("./Root/res/input.txt");
        int[] upper = {24, 49, 74, 99, 124, 149, 174, 200};
        int[] bin = LabAssignment1.createBins(grades, upper);

        int lower = 0;
        for(int i = 0; i < bin.length; i++) {
            System.out.println("[" + lower + " - " + upper[i] + "]: " + bin[i]);
            lower = upper[i] + 1;
        }
    }
}
