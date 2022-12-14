
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import ProductSearchView from "./components/ProductSearchView"
import ProductSearchViewDetail from "./components/ProductSearchViewDetail"
import ShippingManager from "./components/listers/ShippingCards"
import ShippingDetail from "./components/listers/ShippingDetail"

import InventoryManager from "./components/listers/InventoryCards"
import InventoryDetail from "./components/listers/InventoryDetail"

import CustomerManager from "./components/listers/CustomerCards"
import CustomerDetail from "./components/listers/CustomerDetail"


import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/productSearches',
                name: 'ProductSearchView',
                component: ProductSearchView
            },
            {
                path: '/productSearches/:id',
                name: 'ProductSearchViewDetail',
                component: ProductSearchViewDetail
            },
            {
                path: '/shippings',
                name: 'ShippingManager',
                component: ShippingManager
            },
            {
                path: '/shippings/:id',
                name: 'ShippingDetail',
                component: ShippingDetail
            },

            {
                path: '/inventories',
                name: 'InventoryManager',
                component: InventoryManager
            },
            {
                path: '/inventories/:id',
                name: 'InventoryDetail',
                component: InventoryDetail
            },

            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },
            {
                path: '/customers/:id',
                name: 'CustomerDetail',
                component: CustomerDetail
            },


            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },


    ]
})
