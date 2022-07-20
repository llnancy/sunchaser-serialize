# sunchaser-serialize

基于`Hessian2`、`Json`、`Xml`、`Kryo`及`Protostuff`等算法实现数据序列化，主要用于`RPC`通讯场景。

# 序列化算法

## `Hessian2`

使用`Hessian2Output`和`Hessian2Input`完成序列化和反序列化。

## `JSON`

基于`ObjectMapper`实现（也可替换成其它`JSON`库，例如`Gson`或`fastjson`）。

## `XML`

`XML`格式现在几乎被`JSON`格式给取代了，这里仅作为一种参考的序列化实现方式。

## `Kryo`

`Kryo`是一个快速高效的`Java`对象图形序列化框架。底层依赖于字节码生成机制（`ASM`库），在序列化性能上有一定优势。

## `Protostuff`

`Protostuff`是一个`Java`序列化库，基于谷歌`Protocol Buffer`，特点是不需要编写`.proto`文件。
