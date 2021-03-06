/**
 * Created by seungmin on 2016. 7. 13..
 */

Ext.define('Flamingo.view.oozie.workflow.WorkflowJobConf', {
    extend: 'Ext.panel.Panel',
    xtype: 'wfconfiguration',

    layout: {
        type: 'vbox',
        align: 'stretch'
    },
    modal:true,
    resizable: false,

    items: [{
        xtype: 'abstractEditor',
        flex: 1,
        layout: {
            type: 'vbox',
            align: 'stretch'
        },
        reference: 'confEditor',
        parser: 'xml',
        forceFit: true,
        theme: 'eclipse',
        printMargin: false,
        readOnly: true
    }],
    dockedItems: [{
        xtype: 'toolbar',
        reference: 'confToolbar',
        dock: 'top',
        items: [{
            xtype: 'textfield',
            reference: 'txtConfJobId',
            width: 300,
            labelWidth: 50,
            labelAlign: 'right',
            readOnly: true,
            fieldLabel: 'Job ID',
            margin: '0 5 0 0'
        },{
            xtype: 'textfield',
            reference: 'txtConfJobName',
            width: 400,
            labelWidth: 50,
            labelAlign: 'right',
            readOnly: true,
            fieldLabel: 'Name'
        }]
    }]
});