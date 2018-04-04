webpackJsonp([245],{2111:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),n.d(t,"ComponentContainer",function(){return f});var r=n(0),a=(n.n(r),n(10)),o=n(2267),i=n(2268),s=n(259),c=n(2193),l=n(47),p=n(260),u=n(153),m=n(11),h=this&&this.__extends||function(){var e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),d=this&&this.__assign||Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++){t=arguments[n];for(var a in t)Object.prototype.hasOwnProperty.call(t,a)&&(e[a]=t[a])}return e},f=function(e){function t(t){var r=e.call(this,t)||this;return r.addQualifier=function(e){return d({},e,{qualifier:e.breadcrumbs[e.breadcrumbs.length-1].qualifier})},r.fetchBranches=function(e){var t=e.breadcrumbs.find(function(e){return"TRK"===e.qualifier});return t?n.i(c.a)(t.key):Promise.resolve([])},r.handleComponentChange=function(e){r.mounted&&r.setState(function(t){return{component:d({},t.component,e)}})},r.handleBranchesChange=function(){r.mounted&&r.state.component&&r.fetchBranches(r.state.component).then(function(e){r.mounted&&r.setState({branches:e})},function(){})},r.state={branches:[],loading:!0,component:null},r}return h(t,e),t.prototype.componentDidMount=function(){this.mounted=!0,this.fetchComponent(this.props)},t.prototype.componentWillReceiveProps=function(e){e.location.query.id===this.props.location.query.id&&e.location.query.branch===this.props.location.query.branch||this.fetchComponent(e)},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.fetchComponent=function(e){var t=this,r=e.location.query,a=r.branch,o=r.id;this.setState({loading:!0});var i=function(e){t.mounted&&(e.response&&403===e.response.status?n.i(s.default)():t.setState({loading:!1}))};Promise.all([n.i(p.b)(o,a),n.i(l.b)(o,a)]).then(function(e){var n=e[0],r=e[1],a=t.addQualifier(d({},n,r));t.props.organizationsEnabled&&t.props.fetchOrganizations([a.organization]),t.fetchBranches(a).then(function(e){t.mounted&&t.setState({loading:!1,branches:e,component:a})},i)},i)},t.prototype.render=function(){var e=this.props.location.query,t=this.state,n=t.branches,a=t.component,s=t.loading;if(!s&&!a)return r.createElement(o.a,null);var c=n.find(function(t){return e.branch?t.name===e.branch:t.isMain});return r.createElement("div",null,a&&!["FIL","UTS"].includes(a.qualifier)&&r.createElement(i.a,{branches:n,currentBranch:c,component:a,location:this.props.location}),s?r.createElement("div",{className:"page page-limited"},r.createElement("i",{className:"spinner"})):r.cloneElement(this.props.children,{branch:c,branches:n,component:a,onBranchesChange:this.handleBranchesChange,onComponentChange:this.handleComponentChange}))},t}(r.PureComponent),b=function(e){return{organizationsEnabled:n.i(m.areThereCustomOrganizations)(e)}},g={fetchOrganizations:u.b};t.default=n.i(a.connect)(b,g)(f)},2163:function(e,t,n){"use strict";n.d(t,"a",function(){return r}),n.d(t,"e",function(){return a}),n.d(t,"d",function(){return o}),n.d(t,"c",function(){return i}),n.d(t,"b",function(){return s});var r={ALL:"__ALL__",ALL_EXCEPT_PENDING:"__ALL_EXCEPT_PENDING__",PENDING:"PENDING",IN_PROGRESS:"IN_PROGRESS",SUCCESS:"SUCCESS",FAILED:"FAILED",CANCELED:"CANCELED"},a="ALL_TYPES",o={ALL:"__ALL__",ONLY_CURRENTS:"CURRENTS"},i={status:r.ALL_EXCEPT_PENDING,taskType:a,currents:o.ALL,minSubmittedAt:"",maxExecutedAt:"",query:""},s=250},2164:function(e,t,n){"use strict";function r(e){return n.i(m.getJSON)("/api/ce/activity",e)}function a(e){var t={};return e&&Object.assign(t,{componentId:e}),n.i(m.getJSON)("/api/ce/activity_status",t)}function o(e,t){return n.i(m.getJSON)("/api/ce/task",{id:e,additionalFields:t}).then(function(e){return e.task})}function i(e){return n.i(m.post)("/api/ce/cancel",{id:e}).then(function(){return o(e)},function(){return o(e)})}function s(){return n.i(m.post)("/api/ce/cancel_all")}function c(e){return n.i(m.getJSON)("/api/ce/component",{componentKey:e})}function l(){return n.i(m.getJSON)("/api/ce/task_types").then(function(e){return e.taskTypes})}function p(){return n.i(m.getJSON)("/api/ce/worker_count").catch(h.a)}function u(e){return n.i(m.post)("/api/ce/set_worker_count",{count:e}).catch(h.a)}t.c=r,t.d=a,t.g=o,t.e=i,t.f=s,t.a=c,t.b=l,t.h=p,t.i=u;var m=n(19),h=n(42)},2178:function(e,t,n){"use strict";function r(e){var t=e.className,n=e.color,r=e.size;return a.createElement("i",{className:o("status-indicator",n,{"small-status-indicator":"small"===r,"big-status-indicator":"big"===r},t)})}t.a=r;var a=n(0),o=(n.n(a),n(8)),i=(n.n(o),n(2191));n.n(i)},2185:function(e,t,n){t=e.exports=n(27)(void 0),t.push([e.i,".status-indicator{display:inline-block;box-sizing:border-box;width:16px;height:16px;border-radius:16px;margin:4px}.status-indicator.small-status-indicator{width:8px;height:8px;border-radius:8px;margin:8px}.status-indicator.big-status-indicator{width:24px;height:24px;border-radius:24px;margin:0}.status-indicator.red{background-color:#d4333f}.status-indicator.yellow{background-color:#eabe06}.status-indicator.green{background-color:#0a0}",""])},2191:function(e,t,n){var r=n(2185);"string"==typeof r&&(r=[[e.i,r,""]]);var a={};a.transform=void 0;n(28)(r,a);r.locals&&(e.exports=r.locals)},2193:function(e,t,n){"use strict";function r(e){return n.i(i.getJSON)("/api/project_branches/list",{project:e}).then(function(e){return e.branches},s.a)}function a(e,t){return n.i(i.post)("/api/project_branches/delete",{project:e,branch:t}).catch(s.a)}function o(e,t){return n.i(i.post)("/api/project_branches/rename",{project:e,name:t}).catch(s.a)}t.a=r,t.c=a,t.b=o;var i=n(19),s=n(42)},2199:function(e,t,n){"use strict";function r(e){var t=e.branch,r=e.concise,u=void 0!==r&&r;if(n.i(p.a)(t)){if(!t.status)return null;var m=t.status.bugs+t.status.vulnerabilities+t.status.codeSmells,h=m>0?"red":"green";return u?a.createElement("ul",{className:"list-inline branch-status"},a.createElement("li",null,m),a.createElement("li",{className:"spacer-left"},a.createElement(c.a,{color:h,size:"small"}))):a.createElement("ul",{className:"list-inline branch-status"},a.createElement("li",{className:"spacer-right"},a.createElement(c.a,{color:h,size:"small"})),a.createElement("li",null,t.status.bugs,a.createElement(i.a,null)),a.createElement("li",null,t.status.vulnerabilities,a.createElement(l.a,null)),a.createElement("li",null,t.status.codeSmells,a.createElement(s.a,null)))}return t.status?a.createElement(o.a,{level:t.status.qualityGateStatus,small:!0}):null}t.a=r;var a=n(0),o=(n.n(a),n(206)),i=n(112),s=n(113),c=n(2178),l=n(114),p=n(385),u=n(2229);n.n(u)},2228:function(e,t,n){t=e.exports=n(27)(void 0),t.push([e.i,".branch-status{min-width:64px;text-align:right}.branch-status .status-indicator{margin:0}",""])},2229:function(e,t,n){var r=n(2228);"string"==typeof r&&(r=[[e.i,r,""]]);var a={};a.transform=void 0;n(28)(r,a);r.locals&&(e.exports=r.locals)},2267:function(e,t,n){"use strict";var r=n(0),a=(n.n(r),n(9)),o=n(2),i=this&&this.__extends||function(){var e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),s=function(e){function t(){return null!==e&&e.apply(this,arguments)||this}return i(t,e),t.prototype.componentDidMount=function(){var e=document.querySelector("html");e&&e.classList.add("dashboard-page")},t.prototype.componentWillUnmount=function(){var e=document.querySelector("html");e&&e.classList.remove("dashboard-page")},t.prototype.render=function(){return r.createElement("div",{id:"bd",className:"page-wrapper-simple"},r.createElement("div",{id:"nonav",className:"page-simple"},r.createElement("h2",{className:"big-spacer-bottom"},n.i(o.translate)("dashboard.project_not_found")),r.createElement("p",{className:"spacer-bottom"},n.i(o.translate)("dashboard.project_not_found.2")),r.createElement("p",null,r.createElement(a.Link,{to:"/"},"Go back to the homepage"))))},t}(r.PureComponent);t.a=s},2268:function(e,t,n){"use strict";var r=n(0),a=(n.n(r),n(2409)),o=n(2270),i=n(2408),s=n(2274),c=n(2273),l=n(2269),p=n(261),u=n(413),m=n(2164),h=n(2163),d=n(2713),f=(n.n(d),this&&this.__extends||function(){var e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}()),b=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.state={},t.loadStatus=function(){n.i(m.a)(t.props.component.key).then(function(e){t.mounted&&t.setState({currentTask:e.current,isInProgress:e.queue.some(function(e){return e.status===h.a.IN_PROGRESS}),isPending:e.queue.some(function(e){return e.status===h.a.PENDING})})})},t.populateRecentHistory=function(){var e=t.props.component.breadcrumbs,n=e[e.length-1].qualifier;-1!==["TRK","VW","APP","DEV"].indexOf(n)&&p.a.add(t.props.component.key,t.props.component.name,n.toLowerCase(),t.props.component.organization)},t}return f(t,e),t.prototype.componentDidMount=function(){this.mounted=!0,this.loadStatus(),this.populateRecentHistory()},t.prototype.componentDidUpdate=function(e){this.props.component.key!==e.component.key&&(this.loadStatus(),this.populateRecentHistory())},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e,t=this.state,n=t.currentTask,p=t.isInProgress,m=t.isPending;return(p||m||n&&n.status===h.a.FAILED)&&(e=r.createElement(l.a,{component:this.props.component,currentTask:n,isInProgress:p,isPending:m})),r.createElement(u.a,{id:"context-navigation",height:e?95:65,notif:e},r.createElement(a.a,{component:this.props.component.key,favorite:this.props.component.isFavorite}),r.createElement(i.a,{component:this.props.component,breadcrumbs:this.props.component.breadcrumbs}),this.props.currentBranch&&r.createElement(o.a,{branches:this.props.branches,component:this.props.component,currentBranch:this.props.currentBranch,location:this.props.location}),r.createElement(s.a,{branch:this.props.currentBranch,component:this.props.component}),r.createElement(c.a,{branch:this.props.currentBranch,component:this.props.component,location:this.props.location}))},t}(r.PureComponent);t.a=b},2269:function(e,t,n){"use strict";var r=n(0),a=(n.n(r),n(9)),o=n(62),i=n(6),s=(n.n(i),n(735)),c=n(716),l=n(2163),p=n(34),u=n(2),m=this&&this.__extends||function(){var e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),h=function(e){function t(){return null!==e&&e.apply(this,arguments)||this}return m(t,e),t.prototype.renderMessage=function(e){var t=this.props.component,i=void 0!==t.configuration&&t.configuration.showBackgroundTasks,s=n.i(p.g)(t.key);return i?r.createElement(o.c,{defaultMessage:n.i(u.translate)(e,"admin"),id:e+".admin",values:{url:r.createElement(a.Link,{to:s},n.i(u.translate)("background_tasks.page"))}}):r.createElement("span",null,n.i(u.translate)(e))},t.prototype.render=function(){var e=this.props,t=e.currentTask,o=e.isInProgress,i=e.isPending;return o?r.createElement(s.a,{className:"alert alert-info"},r.createElement("i",{className:"spinner spacer-right text-bottom"}),this.renderMessage("component_navigation.status.in_progress")):i?r.createElement(s.a,{className:"alert alert-info"},r.createElement(c.a,{className:"spacer-right"}),this.renderMessage("component_navigation.status.pending")):t&&t.status===l.a.FAILED?t.errorType&&t.errorType.includes("LICENSING")&&n.i(u.hasMessage)("license.component_navigation.button",t.errorType)?r.createElement(s.a,{className:"alert alert-danger"},r.createElement("span",null,t.errorMessage),this.context.canAdmin&&r.createElement(a.Link,{className:"little-spacer-left",to:"/admin/extension/license/app"},n.i(u.translate)("license.component_navigation.button",t.errorType),".")):r.createElement(s.a,{className:"alert alert-danger"},this.renderMessage("component_navigation.status.failed")):null},t.contextTypes={canAdmin:i.bool.isRequired},t}(r.PureComponent);t.a=h},2270:function(e,t,n){"use strict";var r=n(0),a=(n.n(r),n(8)),o=(n.n(a),n(6)),i=(n.n(o),n(2271)),s=n(2276),c=n(2275),l=n(706),p=n(385),u=n(2),m=n(391),h=n(70),d=n(24),f=this&&this.__extends||function(){var e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),b=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.state={dropdownOpen:!1,noBranchSupportPopupOpen:!1,singleBranchPopupOpen:!1},t.handleClick=function(e){e.preventDefault(),e.stopPropagation(),e.currentTarget.blur(),t.setState(function(e){return{dropdownOpen:!e.dropdownOpen}})},t.closeDropdown=function(){t.mounted&&t.setState({dropdownOpen:!1})},t.toggleSingleBranchPopup=function(e){void 0!=e?t.setState({singleBranchPopupOpen:e}):t.setState(function(e){return{singleBranchPopupOpen:!e.singleBranchPopupOpen}})},t.toggleNoBranchSupportPopup=function(e){void 0!=e?t.setState({noBranchSupportPopupOpen:e}):t.setState(function(e){return{noBranchSupportPopupOpen:!e.noBranchSupportPopupOpen}})},t.handleSingleBranchClick=function(e){e.preventDefault(),e.stopPropagation(),t.toggleSingleBranchPopup()},t.handleNoBranchSupportClick=function(e){e.preventDefault(),e.stopPropagation(),t.toggleNoBranchSupportPopup()},t.renderDropdown=function(){var e=t.props.component.configuration;return t.state.dropdownOpen?r.createElement(i.a,{branches:t.props.branches,canAdmin:e&&e.showSettings,component:t.props.component,currentBranch:t.props.currentBranch,onClose:t.closeDropdown}):null},t.renderMergeBranch=function(){var e=t.props.currentBranch;return n.i(p.a)(e)?e.isOrphan?r.createElement("span",{className:"note big-spacer-left text-lowercase"},n.i(u.translate)("branches.orphan_branch"),r.createElement(d.a,{overlay:n.i(u.translate)("branches.orphan_branches.tooltip")},r.createElement("i",{className:"icon-help spacer-left"}))):r.createElement("span",{className:"note big-spacer-left text-lowercase"},n.i(u.translate)("from")," ",r.createElement("strong",null,e.mergeBranch)):null},t.renderSingleBranchPopup=function(){return r.createElement("div",{className:"display-inline-block spacer-left"},r.createElement("a",{className:"link-no-underline",href:"#",onClick:t.handleSingleBranchClick},r.createElement(m.a,{fill:"#4b9fd5"})),r.createElement(h.a,{isOpen:t.state.singleBranchPopupOpen,position:"bottomleft",popup:r.createElement(s.a,null),togglePopup:t.toggleSingleBranchPopup}))},t.renderNoBranchSupportPopup=function(){return r.createElement("div",{className:"display-inline-block spacer-left"},r.createElement("a",{className:"link-no-underline",href:"#",onClick:t.handleNoBranchSupportClick},r.createElement(m.a,{fill:"#cdcdcd"})),r.createElement(h.a,{isOpen:t.state.noBranchSupportPopupOpen,position:"bottomleft",popup:r.createElement(c.a,null),togglePopup:t.toggleNoBranchSupportPopup}))},t}return f(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillReceiveProps=function(e){(e.component!==this.props.component||this.differentBranches(e.currentBranch,this.props.currentBranch)||e.location!==this.props.location)&&this.setState({dropdownOpen:!1,singleBranchPopupOpen:!1})},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.differentBranches=function(e,t){return(!e.isMain||!t.isMain)&&e.name!==t.name},t.prototype.render=function(){var e=this.props,t=e.branches,n=e.currentBranch;return this.context.onSonarCloud&&!this.context.branchesEnabled?null:this.context.branchesEnabled?t.length<2?r.createElement("div",{className:"navbar-context-branches"},r.createElement(l.a,{branch:n,className:"little-spacer-right"}),r.createElement("span",{className:"note"},n.name),this.renderSingleBranchPopup()):r.createElement("div",{className:a("navbar-context-branches","dropdown",{open:this.state.dropdownOpen})},r.createElement("a",{className:"link-base-color link-no-underline",href:"#",onClick:this.handleClick},r.createElement(l.a,{branch:n,className:"little-spacer-right"}),r.createElement(d.a,{overlay:n.name,mouseEnterDelay:1},r.createElement("span",{className:"text-limited text-top"},n.name)),r.createElement("i",{className:"icon-dropdown little-spacer-left"})),this.renderDropdown(),this.renderMergeBranch()):r.createElement("div",{className:"navbar-context-branches"},r.createElement(l.a,{branch:n,className:"little-spacer-right",color:"#cdcdcd"}),r.createElement("span",{className:"note"},n.name),this.renderNoBranchSupportPopup())},t.contextTypes={branchesEnabled:o.bool.isRequired,onSonarCloud:o.bool},t}(r.PureComponent);t.a=b},2271:function(e,t,n){"use strict";var r=n(0),a=(n.n(r),n(6)),o=(n.n(a),n(9)),i=n(2272),s=n(385),c=n(2),l=n(34),p=n(24),u=this&&this.__extends||function(){var e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),m=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.state={query:"",selected:null},t.getFilteredBranches=function(){return n.i(s.d)(t.props.branches).filter(function(e){return e.name.toLowerCase().includes(t.state.query.toLowerCase())})},t.handleClickOutside=function(e){t.node&&t.node.contains(e.target)||t.props.onClose()},t.handleSearchChange=function(e){return t.setState({query:e.currentTarget.value,selected:null})},t.handleKeyDown=function(e){switch(e.keyCode){case 13:return e.preventDefault(),void t.openSelected();case 27:return e.preventDefault(),void t.props.onClose();case 38:return e.preventDefault(),void t.selectPrevious();case 40:return e.preventDefault(),void t.selectNext()}},t.openSelected=function(){var e=t.getSelected(),n=t.getFilteredBranches().find(function(t){return t.name===e});n&&t.context.router.push(t.getProjectBranchUrl(n))},t.selectPrevious=function(){var e=t.getSelected(),n=t.getFilteredBranches(),r=n.findIndex(function(t){return t.name===e});r>0&&t.setState({selected:n[r-1].name})},t.selectNext=function(){var e=t.getSelected(),n=t.getFilteredBranches(),r=n.findIndex(function(t){return t.name===e});r>=0&&r<n.length-1&&t.setState({selected:n[r+1].name})},t.handleSelect=function(e){t.setState({selected:e.name})},t.getSelected=function(){if(t.state.selected)return t.state.selected;var e=t.getFilteredBranches();return e.find(function(e){return e.name===t.props.currentBranch.name})?t.props.currentBranch.name:e.length>0?e[0].name:void 0},t.getProjectBranchUrl=function(e){return n.i(l.f)(t.props.component.key,e)},t.isSelected=function(e){return e.name===t.getSelected()},t.renderSearch=function(){return r.createElement("div",{className:"search-box menu-search"},r.createElement("button",{className:"search-box-submit button-clean"},r.createElement("i",{className:"icon-search-new"})),r.createElement("input",{autoFocus:!0,className:"search-box-input",onChange:t.handleSearchChange,onKeyDown:t.handleKeyDown,placeholder:n.i(c.translate)("search_verb"),type:"search",value:t.state.query}))},t.renderBranchesList=function(){var e=t.getFilteredBranches(),a=t.getSelected();if(0===e.length)return r.createElement("div",{className:"menu-message note"},n.i(c.translate)("no_results"));var o=[];return e.forEach(function(l,u){var m=n.i(s.a)(l)&&l.isOrphan,h=u>0?e[u-1]:null,d=!!n.i(s.a)(h)&&h.isOrphan;(n.i(s.c)(l)||m&&!d)&&o.push(r.createElement("li",{key:"divider-"+l.name,className:"divider"})),m&&!d&&o.push(r.createElement("li",{className:"dropdown-header",key:"orphans"},n.i(c.translate)("branches.orphan_branches"),r.createElement(p.a,{overlay:n.i(c.translate)("branches.orphan_branches.tooltip")},r.createElement("i",{className:"icon-help spacer-left"})))),o.push(r.createElement(i.a,{branch:l,component:t.props.component,key:l.name,onSelect:t.handleSelect,selected:l.name===a}))}),r.createElement("ul",{className:"menu menu-vertically-limited"},o)},t}return u(t,e),t.prototype.componentDidMount=function(){window.addEventListener("click",this.handleClickOutside)},t.prototype.componentWillUnmount=function(){window.removeEventListener("click",this.handleClickOutside)},t.prototype.render=function(){var e=this,t=this.props.component,a="TRK"===t.qualifier&&t.configuration&&t.configuration.showSettings;return r.createElement("div",{className:"dropdown-menu",ref:function(t){return e.node=t}},this.renderSearch(),this.renderBranchesList(),a&&r.createElement("div",{className:"dropdown-bottom-hint text-right"},r.createElement(o.Link,{className:"text-muted",to:{pathname:"/project/branches",query:{id:t.key}}},n.i(c.translate)("branches.manage"))))},t.contextTypes={router:a.object},t}(r.PureComponent);t.a=m},2272:function(e,t,n){"use strict";function r(e){var t=e.branch,r=h(e,["branch"]),d=function(){r.onSelect(t)};return a.createElement("li",{key:t.name,onMouseEnter:d},a.createElement(m.a,{mouseEnterDelay:.5,overlay:t.name,placement:"right"},a.createElement(o.Link,{className:i("navbar-context-meta-branch-menu-item",{active:r.selected}),to:n.i(u.f)(r.component.key,t)},a.createElement("div",{className:"navbar-context-meta-branch-menu-item-name text-ellipsis"},a.createElement(c.a,{branch:t,className:i("little-spacer-right",{"big-spacer-left":n.i(l.a)(t)&&!t.isOrphan})}),t.name,t.isMain&&a.createElement("div",{className:"outline-badge spacer-left"},n.i(p.translate)("branches.main_branch"))),a.createElement("div",{className:"big-spacer-left note"},a.createElement(s.a,{branch:t,concise:!0})))))}t.a=r;var a=n(0),o=(n.n(a),n(9)),i=n(8),s=(n.n(i),n(2199)),c=n(706),l=n(385),p=n(2),u=n(34),m=n(24),h=this&&this.__rest||function(e,t){var n={};for(var r in e)Object.prototype.hasOwnProperty.call(e,r)&&t.indexOf(r)<0&&(n[r]=e[r]);if(null!=e&&"function"==typeof Object.getOwnPropertySymbols)for(var a=0,r=Object.getOwnPropertySymbols(e);a<r.length;a++)t.indexOf(r[a])<0&&(n[r[a]]=e[r[a]]);return n}},2273:function(e,t,n){"use strict";var r=n(0),a=(n.n(r),n(9)),o=n(8),i=(n.n(o),n(6)),s=(n.n(i),n(404)),c=n(385),l=n(2),p=this&&this.__extends||function(){var e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),u=["/project/admin","/project/branches","/project/settings","/project/quality_profiles","/project/quality_gate","/custom_measures","/project/links","/project_roles","/project/history","background_tasks","/project/key","/project/deletion"],m=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.renderExtension=function(e,n){var o=e.key,i=e.name,s=n?"/project/admin/extension/"+o:"/project/extension/"+o;return r.createElement("li",{key:o},r.createElement(a.Link,{to:{pathname:s,query:{id:t.props.component.key}},activeClassName:"active"},i))},t}return p(t,e),t.prototype.isProject=function(){return"TRK"===this.props.component.qualifier},t.prototype.isDeveloper=function(){return"DEV"===this.props.component.qualifier},t.prototype.isPortfolio=function(){var e=this.props.component.qualifier;return"VW"===e||"SVW"===e},t.prototype.isApplication=function(){return"APP"===this.props.component.qualifier},t.prototype.getConfiguration=function(){return this.props.component.configuration||{}},t.prototype.renderDashboardLink=function(){if(this.props.branch&&n.i(c.a)(this.props.branch))return null;var e=this.isPortfolio()?"/portfolio":"/dashboard";return r.createElement("li",null,r.createElement(a.Link,{to:{pathname:e,query:{branch:this.props.branch&&n.i(c.b)(this.props.branch),id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("overview.page")))},t.prototype.renderCodeLink=function(){return this.isDeveloper()?null:r.createElement("li",null,r.createElement(a.Link,{to:{pathname:"/code",query:{branch:this.props.branch&&n.i(c.b)(this.props.branch),id:this.props.component.key}},activeClassName:"active"},this.isPortfolio()||this.isApplication()?n.i(l.translate)("view_projects.page"):n.i(l.translate)("code.page")))},t.prototype.renderActivityLink=function(){return this.props.branch&&n.i(c.a)(this.props.branch)?null:r.createElement("li",null,r.createElement(a.Link,{to:{pathname:"/project/activity",query:{branch:this.props.branch&&n.i(c.b)(this.props.branch),id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("project_activity.page")))},t.prototype.renderIssuesLink=function(){return r.createElement("li",null,r.createElement(a.Link,{to:{pathname:"/project/issues",query:{branch:this.props.branch&&n.i(c.b)(this.props.branch),id:this.props.component.key,resolved:"false"}},activeClassName:"active"},n.i(l.translate)("issues.page")))},t.prototype.renderComponentMeasuresLink=function(){return this.props.branch&&n.i(c.a)(this.props.branch)?null:r.createElement("li",null,r.createElement(a.Link,{to:{pathname:"/component_measures",query:{branch:this.props.branch&&n.i(c.b)(this.props.branch),id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("layout.measures")))},t.prototype.renderAdministration=function(){var e=this.props.branch;if(!this.getConfiguration().showSettings||e&&!e.isMain)return null;var t=u.some(function(e){return-1!==window.location.href.indexOf(e)});if(e&&n.i(c.c)(e))return r.createElement("li",null,r.createElement(a.Link,{className:o({active:t}),id:"component-navigation-admin",to:{pathname:"/project/settings",query:{branch:n.i(c.b)(e),id:this.props.component.key}}},n.i(l.translate)("branches.branch_settings")));var i=this.renderAdministrationLinks();return i.some(function(e){return null!=e})?r.createElement("li",{className:"dropdown"},r.createElement("a",{className:o("dropdown-toggle",{active:t}),id:"component-navigation-admin","data-toggle":"dropdown",href:"#"},n.i(l.translate)("layout.settings")," ",r.createElement("i",{className:"icon-dropdown"})),r.createElement("ul",{className:"dropdown-menu"},i)):null},t.prototype.renderAdministrationLinks=function(){return[this.renderSettingsLink(),this.renderBranchesLink(),this.renderProfilesLink(),this.renderQualityGateLink(),this.renderCustomMeasuresLink(),this.renderLinksLink(),this.renderPermissionsLink(),this.renderBackgroundTasksLink(),this.renderUpdateKeyLink()].concat(this.renderAdminExtensions(),[this.renderDeletionLink()])},t.prototype.renderSettingsLink=function(){return!this.getConfiguration().showSettings||this.isApplication()||this.isPortfolio()?null:r.createElement("li",{key:"settings"},r.createElement(a.Link,{to:{pathname:"/project/settings",query:{branch:this.props.branch&&n.i(c.b)(this.props.branch),id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("project_settings.page")))},t.prototype.renderBranchesLink=function(){return this.context.branchesEnabled&&this.isProject()&&this.getConfiguration().showSettings?r.createElement("li",{key:"branches"},r.createElement(a.Link,{to:{pathname:"/project/branches",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("project_branches.page"))):null},t.prototype.renderProfilesLink=function(){return this.getConfiguration().showQualityProfiles?r.createElement("li",{key:"profiles"},r.createElement(a.Link,{to:{pathname:"/project/quality_profiles",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("project_quality_profiles.page"))):null},t.prototype.renderQualityGateLink=function(){return this.getConfiguration().showQualityGates?r.createElement("li",{key:"quality_gate"},r.createElement(a.Link,{to:{pathname:"/project/quality_gate",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("project_quality_gate.page"))):null},t.prototype.renderCustomMeasuresLink=function(){return this.getConfiguration().showManualMeasures?r.createElement("li",{key:"custom_measures"},r.createElement(a.Link,{to:{pathname:"/custom_measures",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("custom_measures.page"))):null},t.prototype.renderLinksLink=function(){return this.getConfiguration().showLinks?r.createElement("li",{key:"links"},r.createElement(a.Link,{to:{pathname:"/project/links",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("project_links.page"))):null},t.prototype.renderPermissionsLink=function(){return this.getConfiguration().showPermissions?r.createElement("li",{key:"permissions"},r.createElement(a.Link,{to:{pathname:"/project_roles",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("permissions.page"))):null},t.prototype.renderBackgroundTasksLink=function(){return this.getConfiguration().showBackgroundTasks?r.createElement("li",{key:"background_tasks"},r.createElement(a.Link,{to:{pathname:"/project/background_tasks",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("background_tasks.page"))):null},t.prototype.renderUpdateKeyLink=function(){return this.getConfiguration().showUpdateKey?r.createElement("li",{key:"update_key"},r.createElement(a.Link,{to:{pathname:"/project/key",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("update_key.page"))):null},t.prototype.renderDeletionLink=function(){var e=this.props.component.qualifier;return this.getConfiguration().showSettings?"TRK"!==e&&"VW"!==e&&"APP"!==e?null:r.createElement("li",{key:"project_delete"},r.createElement(a.Link,{to:{pathname:"/project/deletion",query:{id:this.props.component.key}},activeClassName:"active"},n.i(l.translate)("deletion.page"))):null},t.prototype.renderAdminExtensions=function(){var e=this;return this.props.branch&&!this.props.branch.isMain?[]:(this.getConfiguration().extensions||[]).map(function(t){return e.renderExtension(t,!0)})},t.prototype.renderExtensions=function(){var e=this,t=this.props.component.extensions||[];return!t.length||this.props.branch&&!this.props.branch.isMain?null:r.createElement("li",{className:"dropdown"},r.createElement("a",{className:"dropdown-toggle",id:"component-navigation-more","data-toggle":"dropdown",href:"#"},n.i(l.translate)("more")," ",r.createElement("i",{className:"icon-dropdown"})),r.createElement("ul",{className:"dropdown-menu"},t.map(function(t){return e.renderExtension(t,!1)})))},t.prototype.render=function(){return r.createElement(s.a,null,this.renderDashboardLink(),this.renderIssuesLink(),this.renderComponentMeasuresLink(),this.renderCodeLink(),this.renderActivityLink(),this.renderAdministration(),this.renderExtensions())},t.contextTypes={branchesEnabled:i.bool.isRequired},t}(r.PureComponent);t.a=m},2274:function(e,t,n){"use strict";function r(e){var t=[],r=e.branch&&n.i(c.a)(e.branch);return e.component.analysisDate&&t.push(a.createElement("li",{key:"analysisDate"},a.createElement(i.a,{date:e.component.analysisDate}))),e.component.version&&!r&&t.push(a.createElement("li",{key:"version"},a.createElement(s.a,{overlay:n.i(l.translate)("version")+" "+e.component.version,mouseEnterDelay:.5},a.createElement("span",{className:"text-limited"},n.i(l.translate)("version")," ",e.component.version)))),a.createElement("div",{className:"navbar-context-meta"},a.createElement("ul",{className:"list-inline"},t),r&&a.createElement("div",{className:"navbar-context-meta-branch"},a.createElement(o.a,{branch:e.branch})))}t.a=r;var a=n(0),o=(n.n(a),n(2199)),i=n(111),s=n(24),c=n(385),l=n(2)},2275:function(e,t,n){"use strict";function r(e){return a.createElement(o.a,{position:e.popupPosition,customClass:"bubble-popup-bottom"},a.createElement("div",{className:"abs-width-400"},a.createElement("h6",{className:"spacer-bottom"},n.i(i.translate)("branches.no_support.header")),a.createElement("p",{className:"big-spacer-bottom markdown"},n.i(i.translate)("branches.no_support.header.text")),a.createElement("p",null,a.createElement("a",{href:"https://redirect.sonarsource.com/editions/developer.html",target:"_blank"},n.i(i.translate)("learn_more")))))}t.a=r;var a=n(0),o=(n.n(a),n(68)),i=n(2)},2276:function(e,t,n){"use strict";function r(e){return a.createElement(o.a,{position:e.popupPosition,customClass:"bubble-popup-bottom"},a.createElement("div",{className:"abs-width-400"},a.createElement("h6",{className:"spacer-bottom"},n.i(i.translate)("branches.learn_how_to_analyze")),a.createElement("p",{className:"big-spacer-bottom markdown"},n.i(i.translate)("branches.learn_how_to_analyze.text")),a.createElement("a",{className:"button",href:"https://redirect.sonarsource.com/doc/branches.html",target:"_blank"},n.i(i.translate)("about_page.read_documentation"))))}t.a=r;var a=n(0),o=(n.n(a),n(68)),i=n(2)},2408:function(e,t,n){"use strict";function r(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function a(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function o(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}var i=n(0),s=n.n(i),c=n(6),l=n.n(c),p=n(10),u=n(9),m=n(92),h=n(11),d=n(724),f=n(392),b=n(264),g=n(154),y=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),v=s.a.createElement("span",{className:"slash-separator"}),E=s.a.createElement("span",{className:"slash-separator"}),_=function(e){function t(){return r(this,t),a(this,(t.__proto__||Object.getPrototypeOf(t)).apply(this,arguments))}return o(t,e),y(t,[{key:"render",value:function(){var e=this.props,t=e.breadcrumbs,r=e.component,a=e.organization,o=e.shouldOrganizationBeDisplayed;if(!t)return null;var i=null!=a&&o,c=t[t.length-1],l=t.map(function(e,r){var a="DIR"===e.qualifier,o=a?n.i(g.collapsePath)(e.name,15):n.i(g.limitComponentName)(e.name);return s.a.createElement("span",{key:e.key},!i&&0===r&&s.a.createElement("span",{className:"navbar-context-title-qualifier little-spacer-right"},s.a.createElement(m.a,{qualifier:c.qualifier})),s.a.createElement(u.Link,{title:e.name,to:{pathname:"/dashboard",query:{id:e.key}},className:"link-base-color link-no-underline"},r===t.length-1?s.a.createElement("strong",null,o):s.a.createElement("span",null,o)),r<t.length-1&&v)});return s.a.createElement("h1",{className:"navbar-context-header"},s.a.createElement(d.a,{title:r.name,organization:i?a:null}),i&&s.a.createElement("span",null,s.a.createElement("span",{className:"navbar-context-title-qualifier little-spacer-right"},s.a.createElement(m.a,{qualifier:c.qualifier})),s.a.createElement(f.a,{organization:a,className:"link-base-color link-no-underline"},a.name),E),l,"private"===r.visibility&&s.a.createElement(b.a,{className:"spacer-left",qualifier:r.qualifier}))}}]),t}(s.a.PureComponent);_.propTypes={breadcrumbs:l.a.array,component:l.a.shape({visibility:l.a.string}).isRequired};var k=function(e,t){return{organization:t.component.organization&&n.i(h.getOrganizationByKey)(e,t.component.organization),shouldOrganizationBeDisplayed:n.i(h.areThereCustomOrganizations)(e)}};t.a=n.i(p.connect)(k)(_)},2409:function(e,t,n){"use strict";function r(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function a(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function o(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}var i=n(0),s=n.n(i),c=n(6),l=n.n(c),p=n(10),u=n(409),m=n(11),h=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),d=function(e){function t(){return r(this,t),a(this,(t.__proto__||Object.getPrototypeOf(t)).apply(this,arguments))}return o(t,e),h(t,[{key:"render",value:function(){return this.props.currentUser.isLoggedIn?s.a.createElement("div",{className:"navbar-context-favorite"},s.a.createElement(u.a,{component:this.props.component,favorite:this.props.favorite})):null}}]),t}(s.a.PureComponent);d.propTypes={currentUser:l.a.object.isRequired};var f=function(e){return{currentUser:n.i(m.getCurrentUser)(e)}};t.a=n.i(p.connect)(f)(d)},2663:function(e,t,n){t=e.exports=n(27)(void 0),t.push([e.i,".navbar-context-favorite{float:left;padding:7px 10px 0 0}.navbar-context-title-qualifier{display:inline-block;line-height:16px;padding-top:5px;box-sizing:border-box}.navbar-context-branches{float:left;padding:8px 0 6px;margin-left:16px;line-height:16px}.navbar-context-meta-branch{margin-top:3px;line-height:16px}.navbar-context-meta-branch-menu-item{display:flex!important;justify-content:space-between;align-items:center}.navbar-context-meta-branch-menu-item-name{flex:1;max-width:300px}.navbar-context-meta-branch-menu-item-actions{height:12px;margin-left:32px}",""])},2713:function(e,t,n){var r=n(2663);"string"==typeof r&&(r=[[e.i,r,""]]);var a={};a.transform=void 0;n(28)(r,a);r.locals&&(e.exports=r.locals)}});
//# sourceMappingURL=245.eaaf9820.chunk.js.map