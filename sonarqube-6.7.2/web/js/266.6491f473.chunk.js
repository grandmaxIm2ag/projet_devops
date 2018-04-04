webpackJsonp([266],{2125:function(t,e,o){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=o(10),r=o(2356),n=o(11),a=o(153),l=function(t,e){return{currentUser:o.i(n.getCurrentUser)(t),languages:o.i(n.getLanguages)(t),organization:e.params.organizationKey?o.i(n.getOrganizationByKey)(t,e.params.organizationKey):null}},p=function(t){return{onRequestFail:function(e){return o.i(a.a)(t)(e)}}};e.default=o.i(i.connect)(l,p)(r.a)},2356:function(t,e,o){"use strict";var i=o(0),r=(o.n(i),o(699)),n=o(387),a=o(2),l=o(724),p=o(2726),s=(o.n(p),this&&this.__extends||function(){var t=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,e){t.__proto__=e}||function(t,e){for(var o in e)e.hasOwnProperty(o)&&(t[o]=e[o])};return function(e,o){function i(){this.constructor=e}t(e,o),e.prototype=null===o?Object.create(o):(i.prototype=o.prototype,new i)}}()),u=function(t){function e(){var e=null!==t&&t.apply(this,arguments)||this;return e.state={loading:!0},e.updateProfiles=function(){return e.fetchProfiles().then(function(t){e.mounted&&e.setState({profiles:o.i(n.g)(t.profiles)})})},e}return s(e,t),e.prototype.componentWillMount=function(){var t=document.querySelector("html");t&&t.classList.add("dashboard-page")},e.prototype.componentDidMount=function(){this.mounted=!0,this.loadData()},e.prototype.componentWillUnmount=function(){this.mounted=!1;var t=document.querySelector("html");t&&t.classList.remove("dashboard-page")},e.prototype.fetchProfiles=function(){var t=this.props.organization,e=t?{organization:t.key}:{};return o.i(r.c)(e)},e.prototype.loadData=function(){var t=this;this.setState({loading:!0}),Promise.all([o.i(r.w)(),this.fetchProfiles()]).then(function(e){if(t.mounted){var i=e[0],r=e[1];t.setState({actions:r.actions,exporters:i,profiles:o.i(n.g)(r.profiles),loading:!1})}})},e.prototype.renderChild=function(){if(this.state.loading)return i.createElement("i",{className:"spinner"});var t=this.props.organization,e=Object.values(this.props.languages);return i.cloneElement(this.props.children,{actions:this.state.actions||{},profiles:this.state.profiles,languages:e,exporters:this.state.exporters,updateProfiles:this.updateProfiles,onRequestFail:this.props.onRequestFail,organization:t?t.key:null})},e.prototype.render=function(){return i.createElement("div",{className:"page page-limited"},i.createElement(l.a,{title:o.i(a.translate)("quality_profiles.page"),organization:this.props.organization}),this.renderChild())},e}(i.PureComponent);e.a=u},2676:function(t,e,o){e=t.exports=o(27)(void 0),e.push([t.i,".quality-profiles-table{padding-top:7px}.quality-profiles-table-inheritance{width:280px}.quality-profiles-table-date,.quality-profiles-table-projects,.quality-profiles-table-rules{min-width:80px}.quality-profiles-list-header{line-height:24px;margin-bottom:20px;padding:5px 10px;border-bottom:1px solid #e6e6e6}.quality-profile-grid{display:flex;justify-content:space-between;align-items:flex-start}.quality-profile-grid-left{width:340px;flex-shrink:0}.quality-profile-grid-right{flex-grow:1;margin-left:20px}.quality-profile-rules-distribution{margin-bottom:15px;padding:7px 20px 0}.quality-profile-rules-deprecated{margin-top:20px;padding:15px 20px;background-color:#f2dede}.quality-profile-rules-sonarway-missing{margin-top:20px;padding:15px 20px;background-color:#fcf8e3}.quality-profile-not-found{padding-top:100px;text-align:center}.quality-profiles-evolution{padding-top:55px}.quality-profiles-evolution-deprecated{border-color:#ebccd1;background-color:#f2dede}.quality-profiles-evolution-stagnant{border-color:#faebcc;background-color:#fcf8e3}.quality-profile-comparison-table{table-layout:fixed}.quality-profile-changelog-rule-cell{line-height:1.5}.quality-profile-changelog-parameter{max-width:270px;word-break:break-word}",""])},2726:function(t,e,o){var i=o(2676);"string"==typeof i&&(i=[[t.i,i,""]]);var r={};r.transform=void 0;o(28)(i,r);i.locals&&(t.exports=i.locals)}});
//# sourceMappingURL=266.6491f473.chunk.js.map