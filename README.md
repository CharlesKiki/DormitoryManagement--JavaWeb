# JavaWeb

> 典型的期末作业大作业

适合Struts2的初学者观看。如果在配置中出现问。论文我做了删简，希望能能给毕业学子们起点借鉴的作用。
管理员：user   123
学生：2009211135   123456
摘  要
随着网络的普及和网络技术的发展，信息化思想已经渗入了每个人的心里。信息化是当今世界发展的大趋势，是推动经济社会变革的重要力量。社会信息化，能使我们交流更加方便，能使我们的办公更加便捷，它推动着社会的进步。目前，随着各高等院校规模的扩大和在校人数的增加，对学生公寓的各项管理工作要求越来越高，然而传统的人工管理模式，效率低下，并且不能及时地动态了解学生住宿情况、宿舍住宿状态等各方面信息，不便于动态及时对学生公寓管理和调整。学生公寓管理系统便是为了公寓管理更加快捷、高效而设计的。学校公寓管理系统基于B/S模式开发，使用JSP动态网页制作技术作为主要的前台开发语言，实现前后台的数据交互；使用struts2+hibernate的框架来对数据的逻辑过程进行处理和对Mysql数据库的数据进行操作。采用了AJAX动态刷新和jQuery-validate验证框架，从而实现了学校公寓信息管理的功能。

【关键词】学生公寓管理系统  B/S  JSP  Struts2  hibernate  AJAX  jQuery

目  录
前言	
第一章  相关基础知识	
第一节  系统分析与设计	
第二节  strtus2简介	
第三节  hibernate简介	
一、使用Hibernate的优点	
二、Hibernate中核心5个接口【2】	
第四节  AJAX及jquery介绍	
一、AJAX简介	
二、jQuery简介	
第二章  开发背景	
第三章  系统分析	
第一节  需求分析	
一、引言	
二、开发环境需求	
三、功能需求	
第二节  可行性分析	
一、操作可行性	
二、经济可行性	
三、技术可行性	
第四章  系统设计	
第一节  功能模块设计	
第二节  操作流程分析	
一、	业务流程图	
二、数据流图	
三、处理过程描述	
第五章 数据库设计	
第一节  数据库分析	
第二节  项目E-R图	
一、实体E-R图	
二、实体之间的关系	
第三节  数据库表设计	
一、数据库模型图	
二、数据表设计	
第六章  系统实现	
第一节 开发环境配置	
一、Struts2配置	
二、Hibernate配置	
三、log4j.properties配置	
四、分页配置	
第二节  系统目录结构与框架	
一、系统目录结构	
二、项目架构	
第三节  功能模板实现	
一、用户登录注销模块	
二、学生信息管理模块	
三、公寓信息管理模块	
四、房间信息管理模块	
五、来访信息管理模块	
六、物品出入管理模块	
七、卫生信息管理模块	
八、住宿信息管理模块	
九、学生信息查询模块	

前言
随着社会进入信息化时代，网络的重要性日益突出，人们对信息化的需求也越来越高，借助于Internet技术的发展与广泛应用，人们对信息的处理已经从传统手工操作逐步转入了计算机信息处理。目前，随着个人电脑的应用与普及，办公管理水平也提升到一个新的层次，逐渐实现了无纸化办公。作为人员密集的高校，后勤的公寓管理也应一改传统的人工管理模式，以求更加信息化、时代化，从而节省人力物力，提高工作效率。传统的公寓信息管理模式已经不能满足学校的需求，因此，基于网络的学校公寓管理信息系统应运而生，它借助于互联网的高效传输，利用计算机技术对学生公寓信息进行处理，很大程度地减少了学生公寓管理的工作量，提升了学生公寓管理的工作效率。
学生公寓管理信息系统是专为广大中等院校、高等院校的公寓学生和公寓管理员所设计的信息系统管理平台。该平台基于互联网，其目的是方便学校单位管理自己学生信息、公寓信息和方便学生查阅住宿信息。
该学生公寓管理系统主要划分了管理员和学生两种权限，管理员包含了普通管理员和超级管理员。实现的功能有学生信息的管理，宿舍信息的管理，宿舍的分配功能，来访者信息管理，寝室卫生管理等。系统具有界面友好，操作简便的特性。在做系统前对学生公寓需要实现的功能做了详细的调查，再做简单的分类，该系统主要包括学生信息管理，宿舍信息管理，来访信息管理，物品出入管理，用户信息管理。此系统仍然不全面，还有许多地方没考虑到，希望在以后的学习中加以改进。

第一章  相关基础知识
第一节  系统分析与设计
随着社会经济的不断发展,经济信息化已成为世界经济发展的大趋势,是社会生产力发展到一定阶段的必然产物。信息是国家制定政策、进行宏观调控，企业从事日常事物处理、生产控制、生产决策的重要战略资源，是国民经济各部门和整个社会生活领域中的“倍增剂”，是当代社会发展的最新生产力，它正从总体上引导着世界经济和社会发展的进程，可以这样说，谁能够为充分利用信息，谁就能在社会竞争及经济发展中求得生存。而要充分利用信息，就必须应用高效的信息系统。
信息系统的开发是一个庞大的系统工程，它涉及到组织的内部结构、管理模式、生产加工、经营管理过程、数据的收集与处理过程、计算机硬件系统的管理和应用、软件系统的开发等各个方面。成功的计算机信息系统的开发，除了具备具有丰富经验的系统开发人员、用户支持和软硬件技术外，还需要研究出科学的开发方法和工程化的开发步骤，以确保整个开发工作能够顺利地进行。因此，良好的信息系统分析与设计对整个信息系统的开发就变得十分重要。
系统分析与设计的方法主要包括结构化生命周期法（又称瀑布法）、原型法（迭代法）、面向对象方法。
①结构化生命周期法
结构化生命周期法是目前国内外较流行的信息系统开发方法，在系统开发中得到了广泛的应用和推广，尤其在开发复杂的大系统时，显示了无比的优越性。它也是迄今为止开发方法中应用最普遍最成熟的一种。其基本思想：将软件工程学和系统工程的理论和方法引入计算机系统的研制开发中，按照用户至上的原则，采用结构化、模块化自顶向下对系统进行分析和设计。具体来说，它将整个信息系统开发过程划分为独立的六个阶段，包括系统分析、程序设计、系统测试、运行和维护以及系统评估。这六个阶段构成信息系统的生命周期。
生命周期法的突出优点是强调系统开发过程的整体性和全局性，强调在整体优化的前提下考虑具体的分析设计问题，即自顶向下的观点。它从时间角度把软件开发和维护分解为若干阶段，每个阶段有各自相对独立的任务和目标。降低了系统开发的复杂性，提高了可操作性。另外，每个阶段都对该阶段的成果进行严格的审批，发现问题及时反馈和纠正，保证了软件质量，特别是提高了软件的可维护性。实践证明，生命周期法大大提高了软件开发的成功率。
但是，生命周期法开发周期较长，因为开发顺序是线性的，各个阶段的工作不能同时进行，前阶段所犯的错误必然带入后一阶段，而且是越是前面犯的错误对后面的工作的影响越大，更正错误所花的工作量就越大。而且，在功能经常要变化的情况下，难以适应变化要求，不支持反复开发。
②原型法
原型法是一种根据用户需求，利用系统开发工具，快速地建立一个系统模型并展示给用户，再此基础上与用户交流，最终实现用户需求的信息系统快速开发的方法。原型法具有开发周期短、见效快、与业务人员交流方便的优点，特别适用于那些用户需求模糊，结构性比较差的信息系统的开发。它从用户界面的开发入手，首先形成系统界面原型，用户运行用户界面原型，并就同意什么和不同意什么提出意见，它是一种自外向内型的设计过程。
③面向对象方法
面向对象方法(Object-Oriented Method)是一种把面向对象的思想应用于软件开发过程中，指导开发活动的系统方法，简称OO (Object-Oriented)方法，是建立在“对象”概念基础上的方法学。对象是由数据和容许的操作组成的封装体，与客观实体有直接对应关系，一个对象类定义了具有相似性质的一组对象。而每继承性是对具有层次关系的类的属性和操作进行共享的一种方式。所谓面向对象就是基于对象概念，以对象为中心，以类和继承为构造机制，来认识、理解、刻画客观世界和设计、构建相应的软件系统。
用计算机解决问题需要用程序设计语言对问题求解加以描述（即编程），实质上，软件是问题求解的一种表述形式。显然，假如软件能直接表现人求解问题的思维路径（即求解问题的方法），那么软件不仅容易被人理解，而且易于维护和修改，从而会保证软件的可靠性和可维护性，并能提高公共问题域中的软件模块和模块重用的可靠性。面向对象的机能念和机制恰好可以使得按照人们通常的思维方式来建立问题域的模型，设计出尽可能自然地表现求解方法的软件。

第二节  strtus2简介
Struts 2是Struts的下一代产品，是在 struts 1和WebWork的技术基础上进行了合并的全新的Struts 2框架。其全新的Struts 2的体系结构与Struts 1的体系结构差别巨大。Struts 2以WebWork为核心，采用拦截器的机制来处理用户的请求，这样的设计也使得业务逻辑控制器能够与Servlet API完全脱离开，所以Struts 2可以理解为WebWork的更新产品。虽然从Struts 1到Struts 2有着太大的变化，但是相对于WebWork，Struts 2的变化很小。
Struts2作为Apache组织的一个开源项目是一种基于MVC设计模式的Java Web开发框架，用其可以简化Java Web项目的开发 ，提高系统的灵活性和可扩展性。
一个请求在Struts2框架中的处理分为以下几个步骤【1】：
①客户端发出一个指向servlet容器的请求(tomcat)；
②这个请求会经过图中的几个过滤器，最后会到达FilterDispatcher过滤器；
③过滤器FilterDispatcher是struts2框架的心脏，在处理用户请求时，它和请求一起相互配合访问struts2 的底层框架结构。在web容器启动时，struts2框架会自动加载配置文件里相关参数，并转换成相应的类。如：ConfigurationManager、ActionMapper和ObjectFactory。ConfigurationManager 存有配置文件的一些基本信息，ActionMapper存有action的配置信息。在请求过程中所有的对象（Action，Results，Interceptors，等）都是通过ObjectFactory来创建的。过滤器会通过询问ActionMapper类来查找请求中需要用到的Action；
④如果找到需要调用的Action，过滤器会把请求的处理交给ActionProxy。ActionProxy为Action的代理对象。ActionProxy通过ConfigurationManager询问框架的配置文件，找到需要调用的Action类；
⑤ActionProxy创建一个ActionInvocation的实例。ActionInvocation在ActionProxy层之下，它表示了  Action的执行状态,或者说它控制的Action的执行步骤。它持有Action实例和所有的Interceptor； 
⑥ActionInvocation实例使用命名模式来调用； 
⑦一旦Action执行完毕，ActionInvocation负责根据struts.xml中的配置找到对应的返回结果。

第三节  hibernate简介
Hibernate是一个开放源代码的对象关系映射框架，它对JDBC进行了非常轻量级的对象封装，使得Java程序员可以随心所欲的使用对象编程思维来操纵数据库。 Hibernate可以应用在任何使用JDBC的场合，既可以在Java的客户端程序使用，也可以在Servlet/JSP的Web应用中使用，最具革命意义的是，Hibernate可以在应用EJB的J2EE架构中取代CMP，完成数据持久化的重任。
Hibernate提供了查询获取数据的方法，用面向对象的思想来操作数据库，节省了我们开发处理数据的时间。
一、使用Hibernate的优点
①使用简介的hql语句（Hibernate query language）。可以不使用传统的insert，update等sql语句。比如insert一个对象，原来的做法是：insert into 表名称 alue（值1，值2，值3，……），而现在的做法是：save（对象）。
②使用or映射。对象到关系数据库之间的映射。是从对象的角度操作数据库，再次体现了面向对象思想。原来的实体抽取方法：首先有了表，然后表映射实体对象。而现在Hibernate做法是：直接由对象映射到表。
③没有侵入性，移植性比较好。什么是没有侵入性？就是Hibernate采用了pojo对象。所谓的pojo对象就是没有继承Hibernate类或实现Hibernate接口。这样的话，此类就是一个普通的java类，所以移植性比较好。  
④支持透明持久化。透明是针对上层而言的。三层架构的理念是上层对下层的依赖，只是依赖接口不依赖具体实现。而Hibernate中的透明是指对业务逻辑层提供了一个接口session，而其他的都封装隐藏。持久化是指把内存中的数据存放到磁盘上的文件中。
二、Hibernate中核心5个接口【2】
①.Configuration接口：负责配置及启动Hibernate，用来创建sessionFactory           
②SessionFactory接口：一个SessionFactory对应一个数据源存储，也就是一个数据库对应一个SessionFactory。SessionFactory用来创建Session对象。并且SessionFactory是线程安全的，可以由多个线程访问SessionFactory共享。
     ③Session接口：这个接口是Hibernate中常用的接口，主要用于对数据的操作（增删改查）。而这个Session对象不是线程安全的。不能共享。
     ④Query接口：用于数据库的查询对象。
     ⑤Transaction接口：Hibernate事务接口。它封装了底层的事务操作，比如JTA（;java transcation architecture）所有的数据操作，比如增删改查都写在事务中。
第四节  AJAX及jquery介绍
一、AJAX简介
AJAX 指异步 JavaScript及 XML（Asynchronous JavaScript And XML）。Ajax的核心是JavaScript对象XmlHttpRequest。该对象在Internet Explorer 5中首次引入，它是一种支持异步请求的技术。简而言之，XmlHttpRequest使您可以使用JavaScript向服务器提出请求并处理响应，而不阻塞用户。
Ajax是使用客户端脚本与Web服务器交换数据的Web应用开发方法。Web页面不用打断交互流程进行重新加裁，就可以动态地更新。使用Ajax，用户可以创建接近本地桌面应用的直接、高可用、更丰富、更动态的Web用户界面。 
异步JavaScript和XML（AJAX）不是什么新技术，而是使用几种现有技术——包括级联样式表（CSS）、JavaScript、XHTML、XML和可扩展样式语言转换（XSLT），开发外观及操作类似桌面软件的Web应用软件。
一个Ajax交互从一个称为XMLHttpRequest的JavaScript对象开始。如同名字所暗示的，它允许一个客户端脚本来执行HTTP请求，并且将会解析一个XML格式的服务器响应。Ajax处理过程中的第一步是创建一个XMLHttpRequest实例。使用HTTP方法（GET或POST）来处理请求，并将目标URL设置到XMLHttpRequest对象上。 
当你发送HTTP请求，你不希望浏览器挂起并等待服务器的响应，取而代之的是，你希望通过页面继续响应用户的界面交互，并在服务器响应真正到达后处理它们。要完成它，你可以向XMLHttpRequest注册一个回调函数，并异步地派发XMLHttpRequest请求。控制权马上就被返回到浏览器，当服务器响应到达时，回调函数将会被调用。
创建Web站点时，在客户端执行屏幕更新为用户提供了很大的灵活性。下面是使用Ajax可以完成的功能：
    ①动态更新购物车的物品总数，无需用户单击Update并等待服务器重新发送整个页面。 
②升站点的性能，这是通过减少从服务器下载的数据量而实现的。例如，在Amazon的购物车页面，当更新篮子中的一项物品的数量时，会重新载入整个页面，这必须下载 32K的数据。如果使用Ajax计算新的总量，服务器只会返回新的总量值，因此所需的带宽仅为原来的百分之一。 
③消除了每次用户输入时的页面刷新。例如，在Ajax中，如果用户在分页列表上单击Next，则服务器数据只刷新列表而不是整个页面。 
④接编辑表格数据，而不是要求用户导航到新的页面来编辑数据。对于Ajax，当用户单击Edit时，可以将静态表格刷新为内容可编辑的表格。用户单击Done之后，就可以发出一个Ajax请求来更新服务器，并刷新表格，使其包含静态、只读的数据。
二、jQuery简介
jQuery是一个兼容多浏览器的javascript库，核心理念是write less,do more(写的更少,做的更多)。jQuery在2006年1月由美国人John Resig在纽约的barcamp发布，吸引了来自世界各地的众多javascript高手加入，现在由Dave Methvin率领团队进行开发。如今，jQuery已经成为最流行的javascript库，在世界前10000个访问最多的网站中，有超过55%在使用jQuery。
jQuery是免费、开源的，使用MIT许可协议。jQuery的语法设计可以使开发者更加便捷，例如操作文档对象、选择DOM元素、制作动画效果、事件处理、使用Ajax以及其他功能。除此以外，jQuery提供API让开发者编写插件。其模块化的使用方式使开发者可以很轻松的开发出功能强大的静态或动态网页。
使用 jQuery，开发人员可以把握问题的要点，并使用尽可能最少的代码实现想要的功能。其主要提供如下功能【3】：
①访问页面框架的局部。DOM获取页面中某个节点或某一类节点有固定的方法，而jQuery则大大地简化了其操作的步骤；
②修改页面的表现（Presentation）。CSS的主要功能就是通过样式风格来修改页面的表现。然而由于各个浏览器支持程度不同，使得很多CSS的特性没能很好地表现。jQuery的出现很好地解决了这个问题，这通过封装JavaScript代码，使得各种浏览器很好地使用CSS3标准，极大丰富了CSS的运用；
③更改页面的内容。jQuery可以很方便地修改页面的内容，包括文本内容、图片、表单选项，甚至整个页面的框架；
④响应事件。引入jQuery之后，开发人员可以更加轻松地处理事件；
⑤为页面添加动画。jQuery的库提供了大量可自定义参数的动画效果；
⑥与服务器异步交互。jQuery提供了一整套Ajax相关的操作，大大方便了异步交互的开发和使用；
⑦简化常用的JavaScript操作。jQuery还提供了很多附加的功能来简化常用的JavaScript操作，例如数组的操作迭代运算等。

第二章  开发背景
进入二十一世纪，计算机技术迅速向着网络化、集成化方向发展。传统的单机版应用软件正在逐渐退出舞台，取而代之的是支持网络、支持多种数据信息（多媒体）的新一代网络版应用软件，而目前网络版软件中似乎存在着两种不同的趋势，一种是称为客户端——服务器的C/S结构应用系统，这类软件具有结构严谨，运行效率高，服务器端压力小，安全性好等优点，被广泛运用于局域网中。而另一种，也是本毕业设计所采用的，是称为浏览器——服务器的B/S结构应用系统，它的特点是在客户端直接采用了功能强大的浏览器软件作为界面，其优点在于软件开发效率高，客户端不受操作平台的限制、也不受地域的限制，网络传输量少，即适用于局域网，更适用于Internet，而且投资小、见效快，用户可以不必进行服务器方面的投资，而是去租用，甚至是免费使用ISP的服务器资源，因而受到越来越多中小型单位的青睐。
随着B/S结构的发展，一种基于软件开发的MVC设计模式也渐渐受到了人们的重视。
MVC已是一种为众多实践所应用的标准设计模式，MVC是模型（Model）、视图（View）和控制器（Controller）的缩写。MVC模式提供了良好的制作软件的途径，但是由于将一个应用程序分成了三部分组件，所以增加了要管理的文件。因此，MVC并不适合小规模的应用程序。对于中等规模以上的应用程序，应用MVC构架得到的好处要远远大于它所带来的额外工作和复杂性【4】。
MVC使得软件开发的设计更有层次性，在一定程度上降低了系统设计的复杂性，缩短了软件开发的周期，也提升了开发软件的质量。传统的 Web 应用开发将页面显示、业务逻辑和数据处理大部分都集中在页面代码中，由于系统的各个部分高度耦合，给后续的系统扩展和维护带来了很大的困难，因此迫切需要一种全新的 Web 应用设计技术，基于 MVC 模式的 Struts1 框架这是在这背景下应运而生。 
无可厚非，Struts1 框架经过若干年的发展已是当前 Web 应用开发中最为流行的框架之一，然而技术总是在不断的发展，Struts1 框架也美中不足，面对大量新的 MVC 框架的蓬勃兴起，Struts1 也开始注入了新的血液，这便促使了 Struts2 框架的诞生。Struts2 框架是在 Struts1 和 WebWork 框架的基础上发展而来的，同时吸取了两者的优势，但与 Struts1 框架相比，在设计理念上有许多本质的不同，对 WebWork 框架有过研究的读者会发现，Struts2 在体系结构和运行流程上与 WebWork 非常相似。所以，在一定程度上可以说 Structs2 实际上继承的是 WebWork 的血统【5】。
Struts2能很好地处理程序的业务逻辑，这给程序员带来了许多方便，但我们仍需一种技术来展示页面和提交数据，与用户之间进行交互。JSP( Java Server Pages) 是 Sun Microsystem 公司倡导的许多公司参与一起建立的一种基于 Java Servlet 的动态网页开发技术。在传统的网页 HTML 文件( * . htm, * . html) 中加入 Java 程序片断( Scriptlet) 和 JSP 标记( tag) , 就构成了 JSP 网页( * . jsp) 。在同一个 JSP 页面上, 用户可以根据自己的不同需要而发送不同的请求, 从而可以得到相应不同的处理结果, 从而实现了网页的动态性和交互性【6】。
除了页面设计和系统业务逻辑处理之外，数据库操作也是信息系统不可或缺的一部分。Hibernate是Jave应用和关系数据库之间的桥梁，它能进行Java对象和关系数据库之间的映射。它对JDBC进行了非常轻量级的对象封装，使得Java程序员可以随心所欲的使用对象编程思维来操纵数据库。 Hibernate可以应用在任何使用JDBC的场合，既可以在Java的客户端程序使用，也可以在Servlet/JSP的Web应用中使用，除此之外，Hibernate还可以在应用EJB的J2EE架构中取代CMP，完成数据持久化的重任【7】。
学生公寓是每一位在校同学生活、学习、相互交流的主要场所，如何提供一个良好的学生公寓的管理体系对学校和同学而言至关重要。以往的学生公寓管理基本上还处于人工操作的阶段，随着计算机技术和网络技术的日益广泛应用，采用计算机以及网络来管理学生公寓似乎也已经不是一件新鲜事了。目前，随着个人电脑的应用与普及，办公管理水平也提升到一个新的层次，逐渐实现了无纸化办公。作为人员密集的高校，后勤的公寓管理也应一改传统的人工管理模式，以求更加信息化、时代化，从而节省人力物力，提高工作效率。传统的公寓信息管理模式已经不能满足学校的需求，因此，基于网络的学生公寓管理系统应运而生。该学校公寓管理信息系统基于MVC设计模式，是服务器的B/S结构应用系统，借助于Strut2+Hibernate开发框架，利用Jsp作为前端开发技术，采用了jQuery validate验证框架，实现了学校公寓信息管理系统的主要功能。


第三章  系统分析
第一节  需求分析
一、引言
　  需求分析是软件系统开发的重要阶段，是系统设计的基础。系统分析的任务，就是在系统规划的基础上，采用一系列行之有效的技术、方法和工具，通过问题识别和对系统的详细调查，使开发人员与用户之间进行有效的沟通，充分了解和获取系统开发的需求，从用户的观点出发，在逻辑上规定系统的结构和功能要求，即建立系统的逻辑模型【8】。需求分析是作为整个软件开发范围的指南,是软件开发人员开发出正确的符合用户要求的软件的重点。该文档将最终交给软件具体开发人员进行具体的开发,其针对的对象是软件开发人员。
二、开发环境需求
①硬件和软件的资源需求
硬件接口：本软件不需要特定的硬件或硬件接口进行支撑，一般windows系统均可运行此软件。  
软件接口：运行于Windows操作系统之上。
软件：JDK, myeclipse9.0 ,tomcat,sturts2,Hibernate,Mysql.
②主要参考资料
《JSP程序设计技术教程》 甘勇 主编
《struts2 web开发学习实录》 杨少敏 ，樊双灵  编著
《30学通java web项目案例开发》  吴亚峰，索依娜 等编著
《精通Hiberante java 对象持久化技术详解》孙卫琴  编著
《精通JavaScript+jQuery》 曾顺  编著
《Struts2+Hibernate+Spring整合开发技术详解》蒲子明，许勇，王黎等编著
三、功能需求
①软件需求分析目标:
(1)给出系统的数据流程图与数据结构,构造一个完全的系统逻辑模型。
(2)提出详细的功能说明,确定设计限定条件,规定性能要求。
(3)密切与用户的联系,使用户明确自己的任务,以便实现上述两项目标。
②系统角色
     公寓学生（一般用户）：登录、查询、修改学生信息，查看公寓公告等。
     公寓管理员（普通管理用户）：对来访人的信息进行记录、删除；卫生检查信息、公寓信息公告。
     系统管理员（超级管理用户）：学生入住、寝室分配、权限管理；宿舍楼、房间和床位的添加、删除、修改以及查找信息。
③主要功能需求
     学生信息管理、宿舍信息管理、来访者信息管理、物品出入管理、管理员信息管理

第二节  可行性分析
    可行性是为系统开发所需而提供的各类人员资源、软件资源、硬件资源和工作环境等。其任务是了解具体的要求及现实环境，从技术、经济和社会因素等方面研究并论证项目的可行性。
一、操作可行性
    我们将此在线订书系统划分为宿舍信息管理、学生信息管理、公寓信息管理、来访信息管理、系统管理，这样使整个网上系统变得清晰明了。学生公寓信息管理系统所涉及的数据不是很多，牵扯的数据逻辑结构也不是很复杂，这些都增加了操作的可靠性。
二、经济可行性
　　由于本系统开发所需要的软件都是从网上免费下载的，因此开发的费用比较低。对于管理公寓人员而言，运用该软件进行学生管理，既经济又实用，很大程度的降低了原来在公寓管理上的花费，而且更加直观和方便，特别是在查询公寓名单、进行卫生检查、方便卫生考评、落实职责职权等上都比以前有了很大的提高；对于学生而言，方便了对公寓信息的查询，节约获取信息所花费的时间，提高了学生的学习效率。
三、技术可行性
由于这个项目不是很复杂，并且所涉及的功能模块都可以用java web技术实现，而以我现在掌握的技术，可以将这个项目编写出来 ，从技术上来说，项目的开发是可行的。

第四章  系统设计
第一节  功能模块设计
①功能划分 



















                       图1.1  功能划分图

②功能描述
1、学生信息管理
根据学生处提供的信息对学生信息进行添加、删除、更新等操作，学生可以登录查询寝室卫生、来访信息、物品出入等信息。
2、宿舍信息管理
主要是记录宿舍的基本状况，可住人数，已住人数，电话号码，便于工作人员分配寝室以及联系。除此之外，该模板还负责对每个星期的寝室卫生检查结果进行记录和公布。
3、来访信息管理
对来访人员的信息进行纪录、删除等操作。
4、物品出入管理
对公寓物品出入信息进行纪录、删除等操作。
5、用户信息管理
    管理员信息的增加、删除操作；管理员权限的管理；学生入住的安排，寝室调房、退房操作。

　第二节  操作流程分析
一、业务流程图
                       图1.2  业务流程图



二、数据流图
图1.3   第一层数据流图
 
                       图1.4  第二层数据流图（管理员）
              
图1.5  第二层数据流图（超级管理员）
                         图1.6   第二层数据流图（学生）


                        图1.7 第三层数据流图a


图1.8 第三层数据流图b






图1.9 第三层数据流图c
三、处理过程描述
◆加工编号：P1.1
加工名称：增加学生
激发条件：新生入住
处理逻辑：根据学校提供数据增加学生信息
输入：学生基本信息。
输出：学生信息数据。

◆加工编号：P1.2
加工名称：删除学生 。
激发条件：学生退房。
处理逻辑：根据学生学号删除与之相关的数据。
输入：学生学号。
输出：删除结果。

◆加工编号：P1.3
加工名称：更新学生信息。
激发条件：学生信息需要改动。
处理逻辑：提出学生信息并加以改动。
输入：改动的学生信息。
输出：改动后的学生信息。

◆加工编号：P8.1
加工名称：增加管理员。
激发条件：增加管理员。
处理逻辑：根据学校提供数据增加管理员信息；
输入：管理员基本信息。
输出：管理员信息数据。

◆加工编号：P8.2
加工名称：删除管理员。
激发条件：管理员调换或离职。
处理逻辑：根据管理员账户删除与之相关的数据；
输入：管理员基本信息。
输出：删除结果。

◆加工编号：P8.3
加工名称：更新管理员。
激发条件：管理员信息有变动。
处理逻辑：根据提供数据更新管理员信息；
输入：管理员更新信息。
输出：管理员信息数据。

◆加工编号：P9.1
加工名称：学生信息查询。
激发条件：查询学生信息。
处理逻辑：根据学号查询学生信息；
输入：学生学号。
输出：学生基本信息。

◆加工编号：P9.3
加工名称：房间信息查询。
激发条件：查询房间信息。
处理逻辑：根据学号查询学生寝室信息；
输入：学生学号。
输出：学生寝室信息。


◆加工编号：P9.4
加工名称：来访人员查询。
激发条件：查询学生来访人员信息。
处理逻辑：根据学号查询学生来访人员信息；
输入：学生学号。
输出：学生来访人员信息。

◆加工编号：P9.5
加工名称：物品信息查询。
激发条件：查询学生物品出入信息。
处理逻辑：根据学号查询学生物品出入信息；
输入：学生学号。
输出：学生物品出入信息。

◆加工编号：P9.6
加工名称：卫生信息查询。
激发条件：查询学生寝室卫生信息。
处理逻辑：根据学号查询查询学生寝室卫生信息；
输入：学生学号。
输出：学生寝室卫生信息。












第五章 数据库设计
    良好的数据库设计对于一个高性能的应用程序非常重要，就像一个空气动力装置对于一辆赛车的重要性一样。如果一辆汽车没有平滑的曲线，将会产生阻力从而变慢。关系没有经过优化，数据库无法尽可能高效地运行。应该把数据库的关系和性能看作是规范化的一部分。良好的数据库设计不仅能提高开发效率，还能为系统功能的扩充留有余地，降低系统升级所需的工作量。

第一节  数据库分析
学校公寓管理信息系统主要是为了减轻学校公寓管理负担和提高管理效率而开发的，该系统主要涉及的数据主要有学生信息、寝室信息、物品出入信息、来访者信息、卫生信息。此系统由JSP+Struts2+Hibernate+Tomcat+Mysql组成，
由于涉及的数据不是太多，对数据库的要求不算太高，所以采用适合中小型企业的MySql数据库较为合适。

第二节  项目E-R图
一、实体E-R图
图2.1  学生实体E-R图



图2.2  物品实体E-R图                           图2.3  来访者实休E-R图

图2.4  房间实体E-R图                           图2.5  管理员实体E-R图

二、实体之间的关系
                       图2.6  实体关系图a
图2.7  实体关系图b

第三节  数据库表设计
一、数据库模型图 
                           图2.8  数据库模型图a

 
图2.9  数据库模型图b


图2.10  数据库模型图c
                          图2.11  数据库模型图d
二、数据表设计
表1.1  用户登录表(user)
列名	数据类型	长度	字段含义
userId	int	11	编号
userName	varchar	50	登录名
userPwd	varchar	50	密码

                       表1.2  管理员登录表(admin)
列名	数据类型	长度	字段含义
adminId	int	11	编号
adminName	varchar	50	登录名
adminPwd	varchar	50	密码
adminPow	int	11	权限
                       
                       表1.3  学生信息表(student)
名	数据类型	长度	字段含义
stuId	int	11	编号
stuName	varchar	50	姓名
stuNum	varchar	50	学号
sex	varchar	2	性别
sbj	varchar	50	班级
stuMajor	varchar	50	专业
stuCollege	varchar	50	学院
ssfz	varchar	50	身份证号
stuEnter	date		入学日期
stuBirth	date		出生日期
stuPhone	varchar	50	联系电话
stuAddress	varchar	50	家庭地址
表1.4  学生住宿表(stuBase)
列名	数据类型	长度	列名含义
stuId	Int 	11	编号
bedNum	varchar	50	床编号
roomId	int	11	房间编号
   
                     表1.5  公寓信息表（apartment）
列名	数据类型	长度	列名含义
apartId	int	11	编号
apartName	varchar	50	公寓名称
apartNum	varchar	20	可住人数
adminId	id	50	管理员编号
apartNote	varchar	100	公寓备注
                                                    
                     表1.6  物品出入表（goods）
列名	数据类型	长度	列名含义
goodsId	Int 	11	编号
stuId	int	11	学生编号
goodsIn	varchar	50	带进物品
goodsOut	varchar	50	带出物品
goodsDate	date		记录时间
adminId	int	11	记录人员
note	varchar	100	备注

                     表1.7 人员来访表（visit）
列名	数据类型	长度	列名含义
visitId	Int 	11	编号
visitName	varchar	50	来访人姓名
stuId	id		被访人学号
relation	varchar	50	关系
visDate	date		来访时间
leaDate	date		离开时间
adminId	int	11	值班人
visCret	varchar	50	证件名称
note	varchar	100	备注

                     表1.8  管理员信息表(manager)
 列名	数据类型	长度	字段含义
manId	int	11	编号
manName	varchar	50	管理员姓名
manPhone	varchar	50	管理员电话
manEmail	varchar	50	管理员邮箱
note	varchar	100	备注
                   
                      表1.9 房间信息表(room)
列名	数据类型	长度	列名含义
roomId	Int 	11	编号
dormNum	varchar	50	房间编号
floorNum	varchar	50	楼层编号
apartId	varchar	50	公寓编号
bedNum	int	11	床位总数
staNum	int	11	已住床位
                      
表1.10  卫生信息表(health)
列名	数据类型	长度	列名含义
id	int	11	编号
roomId	Int 	11	房间编号
health	varchar	20	卫生
checkDate	date		检查日期

 第六章  系统实现
第一节 开发环境配置
 一、Struts2配置
 在web.xml中配置Struts2的核心控制器：
  <filter>
<filter-name>struts2</filter-name>
     <filter-class>org.apache.struts2.dispatcher.FilterDispatcher</filter-class>
</filter>

 <filter-mapping>
	  <filter-name>struts2</filter-name>
	  <url-pattern>/*</url-pattern>
  </filter-mapping>
二、Hibernate配置
在hibernate.cfg.xml文件中，对hibernate数据源及相关参数进行配置：
<hibernate-configuration>
	<session-factory>
		<property name="dialect">
			org.hibernate.dialect.MySQLDialect
		</property>
		<property name="connection.url">
			jdbc:mysql://localhost:3306
		</property>
		<property name="connection.username">root</property>
		<property name="connection.password">2200153</property>
		<property name="connection.driver_class">
			com.mysql.jdbc.Driver
		</property>
		<property name="myeclipse.connection.profile">
			db_apartment
		</property>
		<mapping resource="com/entity/User.hbm.xml" />
		<mapping resource="com/entity/Room.hbm.xml" />
		<mapping resource="com/entity/Manager.hbm.xml" />
		<mapping resource="com/entity/Admin.hbm.xml" />
		<mapping resource="com/entity/Goods.hbm.xml" />
		<mapping resource="com/entity/Student.hbm.xml" />
		<mapping resource="com/entity/Visit.hbm.xml" />
		<mapping resource="com/entity/Apartment.hbm.xml" />
		<mapping resource="com/entity/Stubase.hbm.xml" />
		<mapping resource="com/entity/Health.hbm.xml" />
	</session-factory>
</hibernate-configuration>
三、log4j.properties配置
log4j.rootLogger=INFO, stdout
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%d %p [%c] - %m%n
四、分页配置
public class PageBean {
private List list; //通过hql从数据库分页查询出来的list集合
    private int allRows; //总记录数
    private int totalPage; //总页数
    private int currentPage; //当前页

 /**
     * 得到总页数
     * @param pageSize 每页记录数
     * @param allRows  总记录数
     * @return 总页数
     */
    public int getTotalPages(int pageSize, int allRows)
    {
        int totalPage = (allRows % pageSize == 0)? (allRows / pageSize): (allRows / pageSize) + 1;
         return totalPage;
    }
    /**
     * 得到当前开始记录号
     * @param pageSize 每页记录数
     * @param currentPage 当前页
     * @return
     */
    public int getCurrentPageOffset(int pageSize, int currentPage)
    {
        int offset = pageSize * (currentPage - 1);
        return offset;
    }
    
    /**
     * 得到当前页， 如果为0 则开始第一页，否则为当前页
     * @param page
     * @return
     */
    public int getCurPage(int page)
    {
        int currentPage = (page == 0)? 1: page;
         return currentPage;
    }
 }

第二节  系统目录结构与框架
一、系统目录结构

                        图 3.1  系统目录结构图
二、项目架构
      图3.2   项目架构图（管理员）

                       表2.1   动作对照表a
动作编号	动作内容	动作编号	动作内容
a	管理员登录	b	管理员管理
c	学生管理	d	物品出入管理
e	来访者信息管理	f	公寓信息管理
g	房间信息管理	h	寝室卫生管理
i	学生入住		

                    图3.3   项目架构图（学生）
表2.2   动作对照表b
动作编号	动作内容	动作编号	动作内容
a	学生登录	b	学生信息查询
c	物品信息查询	d	学生来访者查询
e	寝室卫生查询		

第三节  功能模板实现
一、用户登录注销模块
学生登录界面login.jsp使用struts2技术，向服务器端提交请求，主要代码如下 ：
<s:form action="admin_login"  id="loginForm" method="post" name="loginForm" onSubmit="return check()" theme="simple">
    <h3>学校公寓管理信息系统</h3>
    <center>
    <table >
    <tr><td>用户名:</td><td colspan="2"><s:textfield name="admin.adminName" id="name" label=""></s:textfield></td></tr>
    <tr><td></td><td></td></tr>
    <tr><td>密码:</td><td colspan="2"><s:password name="admin.adminPwd" id="pwd" label=""></s:password></td></tr>
    </table>
    <br><br>
<s:submit value="登录" /><s:reset value="重置"/>
</center>
</s:form>


管理员提交登录信息后，系统通过struts.xml的配置找到处理数据的Action（AdminAction）类，主要代码如下：

/* 管理员登录*/
public String login()throws Exception{
	Admin admin1=null;
	admin1=adminService.login(admin.getAdminName(),admin.getAdminPwd());
	if(admin1!=null){
	 	    Map session=ActionContext.getContext().getSession();
	        session.put(AdminInterceptor.ADMIN_SESSION_KEY, admin1);
	        return "success";
		}else{
			this.addActionMessage("用户名或密码错误");
			return "error";
	 }
}
    
	/* 管理员注销*/
public String loginOut() throws Exception{
		Map session=ActionContext.getContext().getSession();
Admin admin1 =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
         //如果用户为空，返回登录页面  	 
         if (admin1!=null) {
        	 session.remove(AdminInterceptor.ADMIN_SESSION_KEY);
        	 this.addActionMessage("已注销");        
         }  
         return "loginOut";
}

学生提交登录信息后，系统通过struts.xml的配置找到处理数据的Action（UserAction）类，主要代码如下：

/*学生登录*/
public String login()throws Exception{
		User user1=null;
		user1=userService.login(user.getUserName(),user.getUserPwd());
		if(user1!=null){
	 	    Map session=ActionContext.getContext().getSession();
	        session.put(UserInterceptor.USER_SESSION_KEY,user1);
	       	return "success";
		}else{
			this.addActionMessage("用户名或密码错误");
			return "error";
		}
}

	/*学生注销*/
	public String loginOut() throws Exception{
		Map session=ActionContext.getContext().getSession();
		User user1 =(User)session.get(UserInterceptor.USER_SESSION_KEY);
         //如果用户为空，返回登录页面  	 
         if (user1!=null) {
        	 session.remove(UserInterceptor.USER_SESSION_KEY);
        	 this.addActionMessage("已注销");        
         }  
         return "loginOut";
	}

登录界面如下图：
                        图 4.1  登录选择界面


                       图 4.2   管理员登录图

                      图4.3  管理员管理界面图

二、学生信息管理模块
学生信息管理模块主要负责增加学生、更新学生信息、删除学生等功能，主要代码如下；
/**
	 * 根据学生学号删除学生
	 * @param  stuId  学生学号
	*/
	public String delete() throws Exception {
		if (stuService.delete(stuId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}

	/**
	 * 更新学生信息
	*/
	public String update() throws Exception {
		if (stuService.update(student)) {
			return "success";
		}else{
			this.addActionMessage("更新失败");
			return "error";
		}
	}
	/**
	 * 根据学生学号获取学生
	 * @param  stuId  学生学号
	*/
	public String edit() throws Exception {
		student =stuService.getById(stuId);
		return "edit";
	}
	/**
	 * 根据学生学号获取学生
	 * @param  stuId  学生学号
	*/
	public String detail() throws Exception{
		student =stuService.getById(stuId);
		return "detail";
	}
	public String findByNum() throws Exception{
		student =stuService.getByNum(stuNum);
		return "detail";
		
	}
	/**
	 * 获取所有学生信息
	*/
	public String find() throws Exception {
		// 表示每页显示5条记录，page表示当前网页
		PageBean pageBean = stuService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("stuPage", pageBean);
        return "success";
	}

                       图4.4   学生信息界面图
                        图 4.5  增加学生界面图

三、公寓信息管理模块
公寓信息管理模块主要负责增加公寓、更新公寓信息、删除公寓等功能，主要代码如下；
/**
	 * 增加公寓信息
	 * @param  adminId  管理员Id
	*/
	public String save() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin1=null;
		admin1 =adminService.getById(adminId);
		if (apService.save(apartment,admin1)) {
			return "success";
		}else{
			this.addActionMessage("添加失败");
			return "error";
		}
	}
	
	/**
	 * 删除公寓信息
	 * @param  apId  管理员Id
	*/
	public String delete() throws Exception {
		if (apService.delete(apId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}
	/**
	 * 更新公寓信息
	*/
	public String update() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Admin admin1=null;
		admin1 =adminService.getById(adminId);
		if (apService.update(apartment,admin1)){
			return "success";
		}else{
			this.addActionMessage("更新失败");
			return "error";
		}
	}
                    图4.6  公寓信息管理界面图


四、房间信息管理模块
房间信息管理模块主要负责增加房间、更新房间信息、删除房间等功能，主要代码如下；
	/**
	 *增加房间
	 * @param  apartId  房间Id
	*/
	public String save() throws Exception{
		Apartment apartment=null;
		apartment=apService.getById(apartId);
		rService.save(room,apartment);
		return "success";
	}
	/**
	 *删除房间
	*/
	public String delete() throws Exception {
		if (rService.delete(roomId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}

                       图4.7  房间信息管理界面 
五、来访信息管理模块
来访信息管理模块主要负责增加来访者、更新来访信息者、删除来访者等功能，主要代码如下；
/**
	 *增加来访者
	 * @param  stuNum  学生学号
	*/
	public String save() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin=null;
		admin =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
		student=stuService.getByNum(stuNum);
		visitService.save(visit, admin, student);
		return "success";
	}
	/**
	 *删除来访者信息
	*/
	public String delete() throws Exception {
		if (visitService.delete(visitId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}

                        图4.8  来访者信息管理界面

六、物品出入管理模块
物品出入模块主要负责增加来物品出入信息、更新物品出入信息、删除物品出入信息等功能，主要代码如下；
/**
	 *增加物品出入信息
	 * @param  stuNum  学生学号
	*/
	public String save() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin=null;
		admin =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
		student=stuService.getByNum(stuNum);
		goodsService.save(goods, admin, student);
		return "success";
	}
		/**
	 *删除物品出入信息
	*/
	public String delete() throws Exception {
		if (goodsService.delete(goodsId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
}
                       图4.9 物品出入信息管理界面
七、卫生信息管理模块
卫生信息管理模块主要负责增加房间卫生信息、更新卫生信息、删除卫生信息等功能，主要代码如下；
/**增加寝室卫生信息
	 * @param  roomId  房间Id
	*/
	public String save() throws Exception{
		Room room=null;
		room=roomService.getById(roomId);
		healthService.save(health, room);
		return "success";
	}
	/**删除寝室卫生信息
	*/
	public String delete() throws Exception {
		if (healthService.delete(healthId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";}
	}
                      图4.10  卫生信息管理界面
八、住宿信息管理模块
住宿信息管理模块主要负责更新住宿信息、删除学生住宿信息等功能，主要代码如下；
/**
	 *删除学生住宿信息
	*/
	public String delete() throws Exception {
		if (stubaseService.delete(stubaseId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}

	/**
	 *更新学生住宿信息
	*/
	public String update() throws Exception {
		Room room=null;
		room=roomService.getById(roomId);
		stubase.setRoom(room);
		if (stubaseService.update(stubase)) {
			return "success";
		}else{
			this.addActionMessage("更新失败");
			return "error";
		}
	}



                         图4.11  住宿信息界面
九、学生信息查询模块
学生信息查询模块主要根据学生学号查询学生基本信息，学生来访者信息、物品出入信息，寝室卫生信息等，其界面如下：

                   图4.12  学生信息查询界面





1、系统测试的定义
    系统测试是针对整个产品系统进行的测试，目的是验证系统是否满足了需求规格的定义，找出与需求规格不相符合或与之矛盾的地方。  
2系统测试的对象
系统测试的对象不仅仅包括需要测试的产品系统的软件，还要包含软件所依赖的硬件、外设甚至包括某些数据、某些支持软件及其接口等。因此，必须将系统中的软件与各种依赖的资源结合起来，在系统实际运行环境下来进行测试。   3系统测试的设计   
系统测试过程包含了测试计划、测试设计、测试实施、测试执行、测试评估这几个阶段，而整个测试过程中的测试依据主要是产品系统的需求规格说明书、各种规范、标准和协议等。在整个测试过程中，首先需要对需求规格进行充分的分析，分解出各种类型的需求（功能性需求、性能要求、其他需求等），在此基础之上才可以开始测试设计工作，而测试设计又是整个测试过程中非常重要的一个环节，测试设计的输出结果是测试执行活动依赖的执行标准，测试设计的充分性决定了整个系统过程的测试质量。因此，为了保证系统测试质量，必须在测试设计阶段就对系统进行严密的测试设计。这就需要我们在测试设计中，从多方面来综合考虑系统规格的实现情况。通常需要从以下几个层次来进行设计：用户层、应用层、功能层、子系统层、协议层 
3.1用户层
主要是面向产品最终的使用操作者的测试。这里重点突出的是在操作者角度上，测试系统对用户支持的情况，用户界面的规范性、友好性、可操作性，以及数据的安全性。主要包括： 
3.1.1用户支持测试      
用户手册、使用帮助、支持客户的其他产品技术手册是否正确、是否易于理解、是否人性化。 
3.1.2用户界面测试  
在确保用户界面能够通过测试对象控件或入口得到相应访问的情况下，测试用户界面的风格是否满足用户要求，例如：界面是否美观、界面是否直观、操作是否友好、是否人性化、易操作性是否较好。
3.1.3可维护性测试   
可维护性是系统软、硬件实施和维护功能的方便性。目的是降低维护功能对系统正常运行带来的影响。例如：对支持远程维护系统的功能或工具的测试。 
3.1.4安全性测试     
这里的安全性主要包括了两部分：数据的安全性和操作的安全性。核实只有规格规定的数据才可以访问系统，其他不符合规格的数据不能够访问系统；核实只有规格规定的操作权限才可以访问系统，其他不符合规格的操作权限不能够访问系统；   
3.2应用层
针对产品工程应用或行业应用的测试。重点站在系统应用的角度，模拟实际应用环境，对系统的兼容性、可靠性、性能等进行的测试。
3.2.1系统性能测试     
针对整个系统的测试，包含并发性能测试、负载测试、压力测试、强度测试、破坏性测试。并发性能测试是评估系统交易或业务在渐增式并发情况下处理瓶颈以及能够接收业务的性能过程；强度测试是在资源情况低的情况下，找出因资源不足或资源争用而导致的错误；破坏性测试重点关注超出系统正常负荷N倍情况下，错误出现状态和出现比率以及错误的恢复能力。
 3.2.2系统可靠性测试     
 一定负荷的长期使用环境下，系统可靠性、稳定性。 
 3.2.3系统兼容性测试      
系统中软件与各种硬件设备兼容性，与操作系统兼容性、与支撑软件的兼容性。 
 3.2.4系统组网测试      
 组网环境下，系统软件对接入设备的支持情况。包括功能实现及群集性能。   
 3.2.5系统安装升级测试      
 安装测试的目的是确保该软件在正常和异常的不同情况下进行安装时都能按预期目标来处理。例如，正常情况下，第一次安装或升级、完整的或自定义的安装都能进行安装。异常情况包括磁盘空间不足、缺少目录创建权限等。还有一个目的是核实软件在安装后可立即正常运行。另外对安装手册、安装脚本等也需要关注。   
3.3功能层    
针对产品具体功能实现的测试。 
3.3.1业务功能的覆盖     
关注需求规格定义的功能系统是否都已实现。
3.3.2业务功能的分解      
通过对系统进行黑盒分析，分解测试项及每个测试项关注的测试类型。  
3.3.3业务功能的组合      
主要关注相关联的功能项的组合功能的实现情况。
3.3.4业务功能的冲突      
业务功能间存在的功能冲突情况。比如：共享资源访问等。

















