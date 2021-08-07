object Caesar_Cipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val a = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  val b = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
  val ct = cipher(a,"s",5,alphabet)
  print(ct)
  print("\n")
  val pt=cipher(b,ct,5,alphabet)
  print(pt)
}
