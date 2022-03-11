On the surface SAX parsers are known for being:

Slower than DOM parsers.
Event driven, requiring the DefaultHandler class be extended in order to provide an event handler suited for the application
Not usually supporting XPath expressions
Processing XML files in a single pass. Making it difficult to implement “backward looking” axes such as parent::, ancestor::, preceding:: or preceding-sibling:: provided the parser supports XPath expressions
Being able to process much larger XML files since they do not keep data in memory
The Saxon HE SAX parser goes against most of those traditions since as compared to the Java DOM pasrser since it:

Is faster
Supports XPath expressions, including support for “backward looking” axes
Does suffer similar memory restrictions when using XPath expressions
