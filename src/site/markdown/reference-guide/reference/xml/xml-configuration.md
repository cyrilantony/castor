Configuring Castor XML (Un)Marshaller {#xml.configuration}
=====================================

Introduction
------------

Configuring the Marshaller
--------------------------

Before using the `Marshaller` class for marshalling Java objects to XML,
the `Marshaller` can be fine-tuned according to your needs by calling a
variety of set-methods on this class. This section enlists the available
properties and provides you with information about their meaning,
possible values and the default value.

| Name | Description | Values | Default | Since
| ---- | ----------- | ------ | ------- | -----
| suppressNamespaces                 `true` or `false`   `false`   -

  : Marshaller properties

Configuring the Unmarshaller
----------------------------

Before using the `Unmarshaller` class for unmarshalling Java objects
from XML, the `Unmarshaller` can be fine-tuned according to your needs
by calling a variety of set-methods on this class. This section enlists
the available properties and provides you with information about their
meaning, possible values and the default value.

  Name         Description   Values                                                                  Default   Since
  ------------ ------------- ----------------------------------------------------------------------- --------- -------
  rootObject                 A Class instance identifying the root class to use for unmarshalling.   -         -

  : Unmarshaller properties