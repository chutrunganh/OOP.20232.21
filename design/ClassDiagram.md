``` 
    +-------------------+
    |    Application    |
    +-------------------+
    | - title: String   |
    | - virus: Virus    |
    +-------------------+
    | + start(): void   |
    | + quit(): void    |
    | + selectVirus(v: Virus): void |
    +-------------------+
             |
             |
             |
+-------------------+     +-------------------+     +-------------------+
|       Virus       |<----|   EnvelopedVirus |     | NonEnvelopedVirus |
+-------------------+     +-------------------+     +-------------------+
| - name: String    |     | - glycoprotein: String | - capsid: String  |
| - structure: String |   +-------------------+     +-------------------+
| - hostCell: String |   | + attach(): void  |     | + dissolveCapsid(): void |
+-------------------+     | + infect(): void  |     +-------------------+
| + displayStructure(): void |
+-------------------+     | + infect(): void  |
             |
             |
             |
+-------------------+
|    Infectable     |
+-------------------+
| + infect(): void  |
+-------------------+
```


Based on your requirements, here's a revised class diagram that separates the infection behavior into a separate `Infectable` interface:

```markdown
    +-------------------+
    |    Application    |
    +-------------------+
    | - title: String   |
    | - virus: Virus    |
    +-------------------+
    | + start(): void   |
    | + quit(): void    |
    | + selectVirus(v: Virus): void |
    +-------------------+
             |
             |
             |
+-------------------+     +-------------------+     +-------------------+
|       Virus       |<----|   EnvelopedVirus |     | NonEnvelopedVirus |
+-------------------+     +-------------------+     +-------------------+
| - name: String    |     | - glycoprotein: String | - capsid: String  |
| - structure: String |   +-------------------+     +-------------------+
| - hostCell: String |   | + attach(): void  |     | + dissolveCapsid(): void |
+-------------------+     | + infect(): void  |     +-------------------+
| + displayStructure(): void |
+-------------------+     | + infect(): void  |
             |
             |
             |
+-------------------+
|    Infectable     |
+-------------------+
| + infect(): void  |
+-------------------+
```

In this diagram, `Infectable` is an interface that defines the `infect` method. Both `EnvelopedVirus` and `NonEnvelopedVirus` implement this interface, demonstrating **polymorphism**. 

Based on your requirements, here's a proposed class diagram:

```markdown
    +-------------------+
    |    Application    |
    +-------------------+
    | - title: String   |
    | - virus: Virus    |
    +-------------------+
    | + start(): void   |
    | + quit(): void    |
    | + selectVirus(v: Virus): void |
    +-------------------+
             |
             |
             |
+-------------------+     +-------------------+     +-------------------+
|       Virus       |<----|   EnvelopedVirus |     | NonEnvelopedVirus |
+-------------------+     +-------------------+     +-------------------+
| - name: String    |     | - glycoprotein: String | - capsid: String  |
| - structure: String |   +-------------------+     +-------------------+
| - hostCell: String |   | + attach(): void  |     | + dissolveCapsid(): void |
+-------------------+     | + inject(): void  |     +-------------------+
| + infect(): void  |     +-------------------+     | + infect(): void  |
| + displayStructure(): void |
+-------------------+
```

In this diagram, `Virus` is an **abstract** class that encapsulates the common properties and behaviors of a virus. `EnvelopedVirus` and `NonEnvelopedVirus` are subclasses of `Virus`, demonstrating inheritance. They each provide their own implementation of the `infect` method, demonstrating polymorphism. 

`EnvelopedVirus` has an additional `attach` method and `NonEnvelopedVirus` has an additional `dissolveCapsid` method, demonstrating encapsulation.


This design meets the requirements of encapsulation (each class has its own state and behavior), abstraction (`Virus` is an abstract class and `Infectable` is an interface), polymorphism (`infect` method is implemented differently in each subclass), and inheritance (`EnvelopedVirus` and `NonEnvelopedVirus` inherit from `Virus`).

- Abstract : +
- Interface: +
- Encapsulation : +
- Overloading : -
- Overridding : +
- Instance : ?
- Aggregation : -
- Dynamic Blinding : -
- Generic programming; -


