class StringComp{
    public static void main(String args[]){
        String s1="ABC";
        String s2="abc";
        String s3="Geetha";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s3));
    }
}
