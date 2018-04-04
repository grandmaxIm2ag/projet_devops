webpackJsonp([260],{2146:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=n(10),r=n(2550),i=n(153),s=n(11),a=function(e){return{currentUser:n.i(s.getCurrentUser)(e)}},l=function(e){return{onRequestFail:n.i(i.a)(e)}};t.default=n.i(o.connect)(a,l)(r.a)},2549:function(e,t,n){"use strict";function o(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function r(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function i(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}var s=n(0),a=n.n(s),l=n(4),p=(n.n(l),n(417)),u=n(416),c=n(2),m=n(738),f=function(){function e(e,t){for(var n=0;n<t.length;n++){var o=t[n];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}return function(t,n,o){return n&&e(t.prototype,n),o&&e(t,o),t}}(),d=function(e){function t(){var e,n,i,s;o(this,t);for(var a=arguments.length,l=Array(a),p=0;p<a;p++)l[p]=arguments[p];return n=i=r(this,(e=t.__proto__||Object.getPrototypeOf(t)).call.apply(e,[this].concat(l))),i.handleToggleUser=function(e,t){e.permissions.includes(t)?i.props.revokePermissionFromUser(e.login,t):i.props.grantPermissionToUser(e.login,t)},i.handleToggleGroup=function(e,t){e.permissions.includes(t)?i.props.revokePermissionFromGroup(e.name,t):i.props.grantPermissionToGroup(e.name,t)},i.handleSelectPermission=function(e){i.props.onPermissionSelect(e)},s=n,r(i,s)}return i(t,e),f(t,[{key:"render",value:function(){var e=m.a[this.props.component.qualifier];"public"===this.props.visibility&&(e=n.i(l.without)(e,"user","codeviewer"));var t=e.map(function(e){return{key:e,name:n.i(c.translate)("projects_role",e),description:n.i(c.translate)("projects_role",e,"desc")}});return a.a.createElement(u.a,{permissions:t,selectedPermission:this.props.selectedPermission,users:this.props.users,groups:this.props.groups,onSelectPermission:this.handleSelectPermission,onToggleUser:this.handleToggleUser,onToggleGroup:this.handleToggleGroup},a.a.createElement(p.a,{query:this.props.query,filter:this.props.filter,onSearch:this.props.onQueryChange,onFilter:this.props.onFilterChange}))}}]),t}(a.a.PureComponent);t.a=d},2550:function(e,t,n){"use strict";function o(e){if(Array.isArray(e)){for(var t=0,n=Array(e.length);t<e.length;t++)n[t]=e[t];return n}return Array.from(e)}function r(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function i(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function s(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}var a=n(0),l=n.n(a),p=n(30),u=n.n(p),c=n(4),m=(n.n(c),n(2551)),f=n(420),d=n(732),h=n(2549),g=n(2552),y=n(740),b=n(64),v=n(2),P=n(423),_=(n.n(P),function(){function e(e,t){for(var n=0;n<t.length;n++){var o=t[n];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}return function(t,n,o){return n&&e(t.prototype,n),o&&e(t,o),t}}()),j=l.a.createElement(y.a,null),C=function(e){function t(e){r(this,t);var s=i(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return s.stopLoading=function(){s.mounted&&s.setState({loading:!1})},s.loadHolders=function(){if(s.mounted){s.setState({loading:!0});var e=s.props.component,t=s.state,n=t.filter,o=t.query,r=t.selectedPermission,i="groups"!==n?b.e(e.key,o,r,e.organization):Promise.resolve([]),a="users"!==n?b.f(e.key,o,r,e.organization):Promise.resolve([]);Promise.all([i,a]).then(function(e){s.mounted&&s.setState({loading:!1,groups:e[1],users:e[0]})},function(e){s.mounted&&(s.props.onRequestFail(e),s.setState({loading:!1}))})}},s.handleFilterChange=function(e){s.mounted&&s.setState({filter:e},s.loadHolders)},s.handleQueryChange=function(e){s.mounted&&s.setState({query:e},function(){(0===e.length||e.length>2)&&s.loadHolders()})},s.handlePermissionSelect=function(e){s.mounted&&s.setState(function(t){return{selectedPermission:t.selectedPermission===e?void 0:e}},s.loadHolders)},s.addPermissionToGroup=function(e,t){return s.state.groups.map(function(n){return n.name===e?Object.assign({},n,{permissions:[].concat(o(n.permissions),[t])}):n})},s.addPermissionToUser=function(e,t){return s.state.users.map(function(n){return n.login===e?Object.assign({},n,{permissions:[].concat(o(n.permissions),[t])}):n})},s.removePermissionFromGroup=function(e,t){return s.state.groups.map(function(o){return o.name===e?Object.assign({},o,{permissions:n.i(c.without)(o.permissions,t)}):o})},s.removePermissionFromUser=function(e,t){return s.state.users.map(function(o){return o.login===e?Object.assign({},o,{permissions:n.i(c.without)(o.permissions,t)}):o})},s.grantPermissionToGroup=function(e,t){s.mounted&&(s.setState({loading:!0,groups:s.addPermissionToGroup(e,t)}),b.g(s.props.component.key,e,t,s.props.component.organization).then(s.stopLoading,function(n){s.mounted&&(s.setState({loading:!1,groups:s.removePermissionFromGroup(e,t)}),s.props.onRequestFail(n))}))},s.grantPermissionToUser=function(e,t){s.mounted&&(s.setState({loading:!0,users:s.addPermissionToUser(e,t)}),b.a(s.props.component.key,e,t,s.props.component.organization).then(s.stopLoading,function(n){s.mounted&&(s.setState({loading:!1,users:s.removePermissionFromUser(e,t)}),s.props.onRequestFail(n))}))},s.revokePermissionFromGroup=function(e,t){s.mounted&&(s.setState({loading:!0,groups:s.removePermissionFromGroup(e,t)}),b.h(s.props.component.key,e,t,s.props.component.organization).then(s.stopLoading,function(n){s.mounted&&(s.setState({loading:!1,groups:s.addPermissionToGroup(e,t)}),s.props.onRequestFail(n))}))},s.revokePermissionFromUser=function(e,t){s.mounted&&(s.setState({loading:!0,users:s.removePermissionFromUser(e,t)}),b.i(s.props.component.key,e,t,s.props.component.organization).then(s.stopLoading,function(n){s.mounted&&(s.setState({loading:!1,users:s.addPermissionToUser(e,t)}),s.props.onRequestFail(n))}))},s.handleVisibilityChange=function(e){"public"===e?s.openDisclaimer():s.turnProjectToPrivate()},s.turnProjectToPublic=function(){s.props.onComponentChange({visibility:"public"}),b.j(s.props.component.key,"public").then(function(){s.loadHolders()},function(e){s.props.onComponentChange({visibility:"private"}),s.props.onRequestFail(e)})},s.turnProjectToPrivate=function(){s.props.onComponentChange({visibility:"private"}),b.j(s.props.component.key,"private").then(function(){s.loadHolders()},function(e){s.props.onComponentChange({visibility:"public"}),s.props.onRequestFail(e)})},s.openDisclaimer=function(){s.mounted&&s.setState({disclaimer:!0})},s.closeDisclaimer=function(){s.mounted&&s.setState({disclaimer:!1})},s.state={disclaimer:!1,filter:"all",groups:[],loading:!0,query:"",users:[]},s}return s(t,e),_(t,[{key:"componentDidMount",value:function(){this.mounted=!0,this.loadHolders()}},{key:"componentWillUnmount",value:function(){this.mounted=!1}},{key:"render",value:function(){var e=null!=this.props.component.configuration&&this.props.component.configuration.canUpdateProjectVisibilityToPrivate;return l.a.createElement("div",{className:"page page-limited",id:"project-permissions-page"},l.a.createElement(u.a,{title:n.i(v.translate)("permissions.page")}),l.a.createElement(m.a,{component:this.props.component,loading:this.state.loading,loadHolders:this.loadHolders}),j,l.a.createElement("div",null,l.a.createElement(d.a,{canTurnToPrivate:e,className:"big-spacer-top big-spacer-bottom",onChange:this.handleVisibilityChange,visibility:this.props.component.visibility}),"TRK"===this.props.component.qualifier&&!e&&l.a.createElement(f.a,{organization:this.props.component.organization}),this.state.disclaimer&&l.a.createElement(g.a,{component:this.props.component,onClose:this.closeDisclaimer,onConfirm:this.turnProjectToPublic})),l.a.createElement(h.a,{component:this.props.component,filter:this.state.filter,grantPermissionToGroup:this.grantPermissionToGroup,grantPermissionToUser:this.grantPermissionToUser,groups:this.state.groups,onFilterChange:this.handleFilterChange,onPermissionSelect:this.handlePermissionSelect,onQueryChange:this.handleQueryChange,query:this.state.query,revokePermissionFromGroup:this.revokePermissionFromGroup,revokePermissionFromUser:this.revokePermissionFromUser,selectedPermission:this.state.selectedPermission,visibility:this.props.component.visibility,users:this.state.users}))}}]),t}(l.a.PureComponent);t.a=C},2551:function(e,t,n){"use strict";function o(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function r(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function i(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}var s=n(0),a=n.n(s),l=n(2),p=n(739),u=function(){function e(e,t){for(var n=0;n<t.length;n++){var o=t[n];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}return function(t,n,o){return n&&e(t.prototype,n),o&&e(t,o),t}}(),c=a.a.createElement("i",{className:"spinner"}),m=function(e){function t(){var e,n,i,s;o(this,t);for(var a=arguments.length,l=Array(a),u=0;u<a;u++)l[u]=arguments[u];return n=i=r(this,(e=t.__proto__||Object.getPrototypeOf(t)).call.apply(e,[this].concat(l))),i.handleApplyTemplate=function(e){e.preventDefault(),e.target.blur();var t=i.props,n=t.component,o=t.loadHolders,r=n.organization?{key:n.organization}:null;new p.a({project:n,organization:r}).on("done",function(){return o()}).render()},s=n,r(i,s)}return i(t,e),u(t,[{key:"render",value:function(){var e=this.props.component,t=e.configuration,o=null!=t&&t.canApplyPermissionTemplate,r=["VW","SVW","APP"].includes(e.qualifier)?n.i(l.translate)("roles.page.description_portfolio"):n.i(l.translate)("roles.page.description2"),i="TRK"===e.qualifier?n.i(l.translate)("visibility",e.visibility,"description"):null;return a.a.createElement("header",{className:"page-header"},a.a.createElement("h1",{className:"page-title"},n.i(l.translate)("permissions.page")),this.props.loading&&c,o&&a.a.createElement("div",{className:"page-actions"},a.a.createElement("button",{className:"js-apply-template",onClick:this.handleApplyTemplate},n.i(l.translate)("projects_role.apply_template"))),a.a.createElement("div",{className:"page-description"},a.a.createElement("p",null,r),null!=i&&a.a.createElement("p",null,i)))}}]),t}(a.a.PureComponent);t.a=m},2552:function(e,t,n){"use strict";function o(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function r(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function i(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}var s=n(0),a=n.n(s),l=n(37),p=n.n(l),u=n(2),c=function(){function e(e,t){for(var n=0;n<t.length;n++){var o=t[n];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}return function(t,n,o){return n&&e(t.prototype,n),o&&e(t,o),t}}(),m=function(e){function t(){var e,n,i,s;o(this,t);for(var a=arguments.length,l=Array(a),p=0;p<a;p++)l[p]=arguments[p];return n=i=r(this,(e=t.__proto__||Object.getPrototypeOf(t)).call.apply(e,[this].concat(l))),i.handleCancelClick=function(e){e.preventDefault(),i.props.onClose()},i.handleConfirmClick=function(e){e.preventDefault(),i.props.onConfirm(),i.props.onClose()},s=n,r(i,s)}return i(t,e),c(t,[{key:"render",value:function(){var e=this.props.component.qualifier;return a.a.createElement(p.a,{isOpen:!0,contentLabel:"modal form",className:"modal",overlayClassName:"modal-overlay",onRequestClose:this.props.onClose},a.a.createElement("header",{className:"modal-head"},a.a.createElement("h2",null,n.i(u.translateWithParameters)("projects_role.turn_x_to_public",this.props.component.name))),a.a.createElement("div",{className:"modal-body"},a.a.createElement("p",null,n.i(u.translate)("projects_role.are_you_sure_to_turn_project_to_public",e)),a.a.createElement("p",{className:"spacer-top"},n.i(u.translate)("projects_role.are_you_sure_to_turn_project_to_public.2",e))),a.a.createElement("footer",{className:"modal-foot"},a.a.createElement("button",{id:"confirm-turn-to-public",onClick:this.handleConfirmClick},n.i(u.translate)("projects_role.turn_project_to_public",e)),a.a.createElement("a",{href:"#",onClick:this.handleCancelClick},n.i(u.translate)("cancel"))))}}]),t}(a.a.PureComponent);t.a=m}});
//# sourceMappingURL=260.c86e9d6c.chunk.js.map