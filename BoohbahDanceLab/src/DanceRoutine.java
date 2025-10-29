public class DanceRoutine {
    private Boohbah[] boohbahs;
    DanceRoutine(Boohbah[] boohbahs){
         this.boohbahs=boohbahs;
    }
    public String buildRoutine() {
        StringBuilder sb = new StringBuilder();
        for (Boohbah booh : boohbahs) {
            sb.append(booh.performMove()).append("\n");
        }
        return sb.toString();
    }

    public String modifyRoutine(){
        StringBuilder modified = new StringBuilder();
        for (Boohbah booh : boohbahs){
            String b = booh.performMove().replace("performs", "dances to");
            modified.append(b).append("\n");
        }return modified.toString();

    }
}
