/* Copyright 2014 the original author or authors:
*
* Rodolfo Castellanos (rodolfojcj at yahoo dot com)
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.opensinergia

/*
 * Taglib for AdminLTE related tasks
 *
 * @author Rodolfo Castellanos
 */
class AdminLTETagLib {
    static namespace = 'altt'

    // works! with the default html tags used by the nav.menu tag library
    // sadly, no customizations at all :( so no exactly what we need for AdminLTE
    //def sidebarMenu = {attrs, body ->
    //    out << nav.menu(attrs + [class: "sidebar-menu"])
    //}

    def sidebarMenu = {attrs, body ->
        // see line 158 of NavigationTagLib.groovy. That's a closure blessing!
        // out << body([item:n, linkArgs:linkArgs, active:active, enabled:enabled])
        out << nav.menu(attrs + [class: "sidebar-menu", custom: true], {menuAttrs ->
            out << '<li' + (menuAttrs.active ? ' class="active"' : '') + '>'
            out << p.callTag(tag: 'g:link', attrs: menuAttrs.linkArgs, {
                out << '<i class="fa' + (menuAttrs.item.data?.faIcon ? ' ' + menuAttrs.item.data.faIcon : '') + '"></i>'
                out << "<span>" + nav.title(menuAttrs) + "</span>"
            })
            out << "</li>"
        })
    }
}
