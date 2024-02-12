# **ORM(Object-Relational Mapping) Supplementary Assignment**

## **Annotations**

#### **@Entity Annotation**

This annotation, part of the javax. persistence package and is used at the class level and marks the class as a persistence entity.It signals to the JPA provider that this class should be treated as a table in the database.

#### **@Id Annotation**

The @Id annotation is inherited from javax. persistence.id, Indicating that the member-field below is the primary key of the current entity.

#### **@GeneratedValue Annotation**

The @GeneratedValue annotation is used to specify how the primary key values of an entity are generated.

#### **@OneToMany Annotation**

@OneToMany annotation in Hibernate is used to obtain one-to-many relationships between two entities. It is used to map a collected-valued association where a single instance of an entity is mapped to multiple instances of another entity.

#### **@ManyToOne Annotation**

@ManyToOne annotation in Hibernate is used to create a many-to-one relationship between two entities. The @ManyToOne annotation indicates that the many instances of one entity can be associated with only one instance of another entity.

#### **@JoinColumn Annotation**

The @JoinColumn annotation in Hibernate is used to specify the mapping of a foreign key column in a relationship between two entities. The @JoinColumn annotation is applied on the owning side of the association to define the foreign key column name and other attributes which are related to the join column.


## **@GeneratedValue (Generation Types)**

#### **1.GenerationType.IDENTITY**

This strategy will help us to generate the primary key value by the database itself using the auto-increment column option. It relies on the database's native support for generating unique values.

#### **2.GenerationType.AUTO**

This is a default strategy and the persistence provider which automatically selects an appropriate generation strategy based on the database usage.

#### **3.GenerationType.TABLE**

This strategy uses a separate database table to generate primary key values. The persistence provider manages this table and uses it to allocate unique values for primary keys.

#### **4.GenerationType.SEQUENCE**

This generation-type strategy uses a database sequence to generate primary key values. It requires the usage of database sequence objects, which varies depending on the database which is being used.