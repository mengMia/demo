package com.multiparams;

public class Foo {
    private Bar bar;
    private Baz baz;
    public Foo(Bar bar, Baz baz){
        System.out.println("Foo构造函数赋值bar和baz");
        this.bar = bar;
        this.baz = baz;
    }

    public void fooSpell(){
        System.out.println("fooSpell调用barSpell和bazSpell方法：");
        bar.barSpell();
        baz.bazSpell();
    }
}
