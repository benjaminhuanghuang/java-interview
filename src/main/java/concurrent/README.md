



## synchronized
- on method (lock current object)
会生成字节码 access flag

- on static method (lock method 所属 class)
synchronized 会生成字节码
```
    monitorenter

    
    monitorexit
```
- on class
```
    synchronized (ThreadsSynch2.class)
    {
        
    }
```
- on object
```
    synchronized (new Object()){

    }

```
synchronized 会生成字节码
```
    monitorenter

    
    monitorexit
```
monitorenter 对应的代码在
```
bytecodeinterpreter.cpp
```

## lock
不要把unlock放在try{}中，而要放在final{}中