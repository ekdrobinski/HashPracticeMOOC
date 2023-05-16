public class IouMain {

    public static void main(String[] args) {
        // Test your program here
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}