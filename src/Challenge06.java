import java.util.Arrays;
public class Challenge06 {
public static void main(String[] args){
    int[] tab = { 1, 2, 3, 4, 5};
    int[] newTab = Arrays.copyOf(tab , tab.length);
    newTab[0] = tab[tab.length - 1];
    for( int i = 1 ; i < newTab.length ; i ++){
        newTab[i] = tab[i - 1];
    }
     System.out.println(Arrays.toString(newTab));
}
}