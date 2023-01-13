package com.audintel.collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;


public class PurchaseOrderMain {
	
static	class PurchseOrderSortById  implements Comparator<PurchaseOrder>{
		@Override
		public int compare(PurchaseOrder o1, PurchaseOrder o2) {
			return Long.valueOf(o2.getPurchaseOrderId()).compareTo(Long.valueOf(o1.getPurchaseOrderId()));
		}
	}
static	class PurchseOrderSortByDate  implements Comparator<PurchaseOrder>{
		@Override
		public int compare(PurchaseOrder o1, PurchaseOrder o2) {
			return  o1.getPurchaseOrderDate().compareTo(o2.getPurchaseOrderDate());
		}
	}

	
	public static String myDateFormat(Date d) {
		return new SimpleDateFormat("dd-MM-yyyy").format(d);
	}

	public static void displayPurchaseOrderDetail(List<PurchaseOrder> list) {
		System.out.println("Purchase Order Details ");
		System.out.println("Id\tName\tCost\tDate\n");
		for (PurchaseOrder purchaseOrder : list) {
			System.out.println(purchaseOrder.getPurchaseOrderId() + "\t" + purchaseOrder.getPurchaseOrderName() + "\t"
					+ purchaseOrder.getPurchaseOrderCost() + "  " + myDateFormat(purchaseOrder.getPurchaseOrderDate()));
		}
	}

	public static void main(String[] args) {


		List<PurchaseOrder> orderList = new ArrayList<>();

		PurchaseOrder order;
		for (int i = 0; i < PurchaseOrderData.date.length; i++) {
			order = null;
			order = new PurchaseOrder();
			order.setPurchaseOrderId(PurchaseOrderData.id[i]);
			order.setPurchaseOrderName(PurchaseOrderData.nm[i]);
			order.setPurchaseOrderCost(PurchaseOrderData.cost[i]);
			order.setPurchaseOrderDate(PurchaseOrderData.date[i]);
			orderList.add(order);
		}
		System.out.println("Unsorted Purchase Order Details \n");
		displayPurchaseOrderDetail(orderList);

		Collections.sort(orderList,new PurchseOrderSortById());

		System.out.println("Sorted Purchase Order Details By Id\n");
		displayPurchaseOrderDetail(orderList);

		Collections.sort(orderList,new PurchseOrderSortByDate());
		
		System.out.println("Sorted Purchase Order Details By Date\n");
		displayPurchaseOrderDetail(orderList);

	}
}
