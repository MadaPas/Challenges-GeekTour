package earlyjava.inheritance.latin;

class Translate {

    public Translate(String str) {
        str = str.toUpperCase();
        String[] split = str.split(" ");

        String newString = "";
        for (String s : split) {
            StringBuilder x = new StringBuilder(s);
            x.append(x.charAt(0)).append("AY");
            x.deleteCharAt(0);
            newString += x + " ";
        }
        System.out.println(newString);
    }
}
