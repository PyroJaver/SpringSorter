package logging;

public class SpaceGenerator {
    public String generateSpace(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 20-str.length(); i++){
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
