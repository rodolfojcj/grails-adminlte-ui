adminlte-ui: a Grails plugin for installing the AdminLTE template
=================================================================

_adminlte-ui_ is a plugin based on two existing and *awesome* projects:

* [AdminLTE](http://almsaeedstudio.com/preview) Dashboard and Control Panel Template authored by [Abdullah Almsaeed](https://twitter.com/Almasaeed2010) from [Almsaeed Studio](http://almsaeedstudio.com).
* The Navigation API of the [Grails Platform Core](http://grails.org/plugin/platform-core) plugin.

The goal is to provide a nice UI theme to Grails applications reusing these projects in a way that is as easy and functional as possible.

Also, some ideas for the implementation have been taken from the [Kickstart with Bootstrap](https://grails.org/plugin/kickstart-with-bootstrap) Grails plugin.

Thanks a lot to all the developers of these mentioned projects! They have done an excellent and very valuable work.

Right now _adminlte-ui_ offers a minimal and very basic functionality.

Dependency on Resources plugin
------------------------------

Given that _adminlte-ui_ depends _Grails Platform Core_ plugin, which in turn
depends on [Resources plugin](http://grails.org/plugin/resources), your project
will need to use the _resources_ plugin. This have been briefly tested to work
with Grails versions 2.3.x, 2.4.x and 2.5.x

Since Grails version 2.4.x the [Asset Pipeline](http://grails.org/plugin/asset-pipeline)
plugin is now favored, instead of the already mentioned Resources plugin, but
_adminlte-ui_ is not ready to use the _Asset Pipeline_ plugin. Eventually, when
_Grails Platform Core_ is updated to work with the _Asset Pipeline_ it will be
worth to also adapt and upate _adminlte-ui_.

Simplest Example
----------------

Supposing you have just created a Grails application, with these little changes you will have the AdminLTE template applied to the views:

* In the _grails-app/conf/BuildConfig.groovy_ add the _adminlte-ui_ plugin:

```
        plugins {
            // ...
            runtime ':resources:1.2.14'
            runtime ':adminlte-ui:0.1.0'
            // ...
        }
```

* Change the _grails-app/views/index.gsp_ file so it uses the _adminlte_layout instead of the _main_content_. At the end the _meta_ tag should be left as this:

```
        <meta name='layout' content='adminlte'/>
```

Some Customizations
-------------------

The _adminlte-ui_ plugin allows views' customization through templates that can be overwritten by your application; if you don't change them, then the default views' templates included in the plugin will be used. To overwrite them, put in the _grails-app/views/adminlte_tmpl_ directory any of the following template files:

* _littleDropdown.gsp
* _sidebarForm.gsp
* _sidebarToggle.gsp
* _userDropdown.gsp
* _userPanel.gsp

You can view the source code of them to get an idea of what to change.

Applying taglibs
----------------

It's likely you will have to modify the layout to fit your needs and to do that the easiest way is to copy the _adminlte.gsp_ included in the plugin to your application, so its final path is _grails-app/views/layouts/adminlte.gsp_ and after that you can use the _adminlte-ui_ taglibs from that copied layout file to get a custom look. Some examples:

* In the sidebar, set a custom image and a greeting (or caption) for the use

```
        <altt:sidebar userImage='http://www.fillmurray.com/350/350' userGreeting='Welcome, Mr. John Doe!'/>
```

* In the top right corner user dropdown of the header bar, set a custom image and other fields for the user

```
        <altt:header userName='Mr. John Doe' userImage='http://www.fillmurray.com/350/350' userTitle='CEO' userSummary='Online' />
```

Custom navigation menu
----------------------

Thanks to the navigation API of the Grails Platform Core plugin, you can customize the generated menu on the left sidebar, as this:

* Create the navigation file, for example _grails-app/conf/AppNavigation.groovy_ with the following content:

```
        def loggedIn = { ->
            // is up to you what and how to return here
            false
        }

        navigation = {
          appMenu {
            'Login' (controller: 'login', action: 'index', data:[faIcon: 'fa-sign-in'], visible: loggedIn)
            Home(uri: '/', data:[faIcon: 'fa-home'])
            MyController(data:[faIcon: 'fa-circle-o-notch'], controller: 'mycontroller', visible: true) {
              MyAction(action: 'list')
            }
            RandomSites(data:[faIcon: 'fa-institution']) {
              Wikipedia(url: 'http://www.wikipedia.org')
              Grails(url: 'http://www.grails.org')
            }
            'Logout' (controller: 'logout', action: 'index', data:[faIcon: 'fa-sign-out'], visible: loggedIn)
          }
        }
```

* Change the _sidebar_ taglib. Note that only a menu with a depth of 2 levels is supported (and tested) and also that the _scope_ attribute takes as value the name used within the navigation file

```
        <altt:sidebar forceDeep='true', depth='2' scope='appMenu' userImage='http://www.fillmurray.com/350/350' userGreeting='Mr. John Doe - CEO'/>
```

Copyright and License
---------------------

   Copyright 2014-2015 Rodolfo Castellanos

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
