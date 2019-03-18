package RPG;

class Character{
  protected int hp;
  protected int mp;
  protected int attackPoint;
  protected String name;

  //コンストラクタ
  public Character(String name,int hp ,int mp,int attackPoint){
    this.name = name; //インスタンス変数のnameに引数で受け取ったnameを代入
    this.hp = hp;
    this.mp = mp;
    this.attackPoint = attackPoint;
  }

  public void introduce(){
    System.out.println("私は"+name+"だ。私の体力は"+hp+"だ。私のマジックポイントは"+mp+"だ。私のアタックポイントは"+attackPoint+"だ");
  }

  public void damage(int damagePoint,String name){
    System.out.println(this.name+"は"+name+"から" + damagePoint+"ポイントの攻撃を受けた");//this.name インスタンス変数 ,name 引数のname
    this.hp -= damagePoint;
  }

  public void Attack(Character c){
    System.out.println(name +"の攻撃!!");
    c.damage(attackPoint,name);
  }

}
