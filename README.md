# **ORM(Object-Relational Mapping) Supplementary Assignment**

### **@Entity Annotation**

This annotation, part of the javax. persistence package and is used at the class level and marks the class as a persistence entity.It signals to the JPA provider that this class should be treated as a table in the database.

### **@Id Annotation**

The @Id annotation is inherited from javax. persistence.id, Indicating that the member-field below is the primary key of the current entity.

### **@GeneratedValue Annotation**

The @GeneratedValue annotation is used to specify how the primary key values of an entity are generated.

### **@OneToMany Annotation**

@OneToMany annotation in Hibernate is used to obtain one-to-many relationships between two entities. It is used to map a collected-valued association where a single instance of an entity is mapped to multiple instances of another entity.

### **@ManyToOne Annotation**

@ManyToOne annotation in Hibernate is used to create a many-to-one relationship between two entities. The @ManyToOne annotation indicates that the many instances of one entity can be associated with only one instance of another entity.

### **@JoinColumn Annotation**

The @JoinColumn annotation in Hibernate is used to specify the mapping of a foreign key column in a relationship between two entities. The @JoinColumn annotation is applied on the owning side of the association to define the foreign key column name and other attributes which are related to the join column.




