package sealedkeywords;

//sealed - only limited classes can inherit sealed class
//after inheriting -class should be either sealed,non-sealed or final
//non-sealed - other class can inherit

sealed class Demo permits A ,B {
}
final  class A extends Demo{
}
non-sealed class B extends Demo{
}
class C extends B{
    
}
sealed class D extends Thread implements Cloneable permits E  {
}
non-sealed class E extends D{
}