Ext.onReady(function() {

	Ext.define('User', {
		extend : 'Ext.data.Model',
		fields : [ {
			name : 'id',
			type : 'int'
		}, {
			name : 'username',
			type : 'string'
		} ]
	});
	
	var userStore = Ext.create('Ext.data.Store', {
		model : 'User',
		proxy : {
			type : 'ajax',
			url : '/users/list',
			reader : {
				type : 'json',
				root : 'users'
			}
		},
		autoLoad : true
	});

	Ext.create("Ext.container.Viewport", {
		layout : 'border',
		items : [ {
			xtype : 'panel',
			title : 'Header',
			region : 'north',
			height : 100
		}, {
			xtype : 'panel',
			title : 'Sidebar',
			region : 'west',
			width : 200
		}, {
			xtype : 'grid',
			title : '用戶表',
			region : 'center',
			columns : [ {
				header : 'ID',
				dataIndex : 'id'
			}, {
				header : '名字',
				dataIndex : 'username',
				flex : 1
			} ],
			store : userStore,
			dockedItems: [{
		        xtype: 'pagingtoolbar',
		        store: userStore,   // same store GridPanel is using
		        dock: 'bottom',
		        displayInfo: true
		    }]
		} ]

	});
});