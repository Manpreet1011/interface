public class temp {
    public static void main(String[] args) {
        String str = "fez day";
        System.out.println(countYZ(str));
    }

        public static int countYZ(String str) {
            //String[] words=str.split("\\s+");
            str=str+" ";
            int count=0;
                for(int i=1;i<str.length();i++)
                {
                    if(!(Character.isLetter(str.charAt(i)))&&(str.charAt(i-1)=='z')||(str.charAt(i-1)=='y'))
                        count++;
                }

            return count;
        }

}
