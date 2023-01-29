public class hometask_02 {
    public static void main(String[] args) throws Exception{
        
        hometask_002_read Fread = new hometask_002_read();
        hometask_002 ht = new hometask_002();
        ht.readpow(Fread.fileRead("a"), Fread.fileRead("b"));
    }
}
