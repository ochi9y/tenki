package tenki;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        InBean ib = new InBean();
        ib.setTorihikisakiName("セントラル商会");
        ib.setTorihikiDate( LocalDate.of(2018, 5, 2) );
        ib.setGoukei(400);

        ib.getLines().add(  new InLineBean("消しゴム",1,100) );
        ib.getLines().add(  new InLineBean("鉛筆",20,300) );

        OutBean ob = tenki( ib );
        System.out.println( ob.toString() );
    }

    @Override
    public String toString() {
        return "Main []";
    }

    static OutBean tenki( InBean ib)
    {
        OutBean ob = new OutBean();
        //1.元となる表の行数を見る
        int gyousu = ib.getLines().size();
        //2.元となる表の列数を見る

        //3.元となる1の行数と2の列数の新たな表を作成する
        //4行を超える行数の場合、超えた分は次ページに作成する
        //4.元となる表の1の行数を新たな表の1列目に入れる
        //5.元となる表の1列目の項目名を見る
        //6.5で見た項目名を新たな表の1行目の2列目から入れる
        //7.元となる表の2行目以降、2列目以降を見る。
        //8.文字、数字が入っている所を新たな表に入れる。
        //9.日付を見る
        //10.日付を入れる
        //12.取引先を入れる
        //13.項目名の金額列を合計した値をだす
        //14.合計金額に13でだした値をいれる


        return null;
    }

}
//------------------------------------
class InBean
{
    private LocalDate 			torihikiDate;
    private String	  			torihikisakiName;
    private int		  			goukei;
    private List<InLineBean> 	lines= new ArrayList<InLineBean>();

    public LocalDate getTorihikiDate() {
        return torihikiDate;
    }
    public void setTorihikiDate(LocalDate torihikiDate) {
        this.torihikiDate = torihikiDate;
    }
    public String getTorihikisakiName() {
        return torihikisakiName;
    }
    public void setTorihikisakiName(String torihikisakiName) {
        this.torihikisakiName = torihikisakiName;
    }
    public int getGoukei() {
        return goukei;
    }
    public void setGoukei(int goukei) {
        this.goukei = goukei;
    }
    public List<InLineBean> getLines() {
        return lines;
    }



}
class InLineBean
{
    private String shouhinName;
    private int		suuryo;
    private int		kingaku;



    public InLineBean(String shouhinName, int suuryo, int kingaku) {
        super();
        this.shouhinName = shouhinName;
        this.suuryo = suuryo;
        this.kingaku = kingaku;
    }
    public String getShouhinName() {
        return shouhinName;
    }
    public void setShouhinName(String shouhinName) {
        this.shouhinName = shouhinName;
    }
    public int getSuuryo() {
        return suuryo;
    }
    public void setSuuryo(int suuryo) {
        this.suuryo = suuryo;
    }
    public int getKingaku() {
        return kingaku;
    }
    public void setKingaku(int kingaku) {
        this.kingaku = kingaku;
    }


}
//------------------------------------
class OutBean
{
  private LocalDate 			torihikiDate;
  private String	  			torihikisakiName;
  private int		  			goukei;
  private List<OutLineBean> 	lines= new ArrayList<OutLineBean>();

    public LocalDate getTorihikiDate() {
        return torihikiDate;
    }
    public void setTorihikiDate(LocalDate torihikiDate) {
        this.torihikiDate = torihikiDate;
    }
    public String getTorihikisakiName() {
        return torihikisakiName;
    }
    public void setTorihikisakiName(String torihikisakiName) {
        this.torihikisakiName = torihikisakiName;
    }
    public int getGoukei() {
        return goukei;
    }
    public void setGoukei(int goukei) {
        this.goukei = goukei;
    }
    public List<OutLineBean> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "OutBean [torihikiDate=" + torihikiDate + ", torihikisakiName=" + torihikisakiName + ", goukei=" + goukei
                + ", lines=" + lines + "]";
    }

}
//------------------------------------
class OutLineBean
{
  private String shouhinName;
  private int		suuryo;
  private int		kingaku;
    public String getShouhinName() {
        return shouhinName;
    }
    public void setShouhinName(String shouhinName) {
        this.shouhinName = shouhinName;
    }
    public int getSuuryo() {
        return suuryo;
    }
    public void setSuuryo(int suuryo) {
        this.suuryo = suuryo;
    }
    public int getKingaku() {
        return kingaku;
    }
    public void setKingaku(int kingaku) {
        this.kingaku = kingaku;
    }

    @Override
    public String toString() {
        return "OutLineBean [shouhinName=" + shouhinName + ", suuryo=" + suuryo + ", kingaku=" + kingaku + "]";
    }


}