public class Array4 {
    public static void main(String[] args) {
        int array1[]= {4 ,2 ,7 ,4 ,9};
        int array2[]= {3 ,7 ,8 ,3 ,8};

        for (int i = 0; i < array2.length; i++) {
            if (array1[i]<=array2[i]) {
                System.out.println(array2[i]);
            }
            if(array2[i]<=array1[i]){
                System.out.println(array1[i]);
                
            }
        }
    }
}
