package fsmflying.commonweb.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsmflying.sys.service.ISequenceService;

import fsmflying.demo.dm.Order;
import fsmflying.demo.dm.OrderDetail;
import fsmflying.demo.service.OrderService;

@Controller
@RequestMapping("/trans")
public class SpringTransaction {

	@Resource
	OrderService orderService;

	@Resource
	ISequenceService sequenceService;

	@RequestMapping("/order/add")
	public String OrderTransaction(Model model) {
		Date orderDate = Calendar.getInstance().getTime();

		int orderId = sequenceService.generateNextId("northwind.order");
		List<OrderDetail> details = new ArrayList<OrderDetail>();
		for (int i = 0; i < 5; i++) {
			details.add(new OrderDetail(sequenceService
					.generateNextId("northwind.orderdetail"), orderId, i + 1,
					0.3 * (i + 1), 10 * (i + 1), (int) (Math.round(Math
							.random() * 1000)) % 100));
		}
		Order order = new Order(orderId, orderDate, new Date(
				orderDate.getTime() + 3 * 24 * 60 * 60 * 1000), new Date(
				orderDate.getTime() + 2 * 24 * 60 * 60 * 1000), "/order/add",
				details);

		orderService.addOrder(order);
		System.out.println("Spring事务测试：添加Order及明细列表OrderDetail!");
		model.addAttribute("message",
				"Spring事务测试：添加Order及明细列表OrderDetail,没有错误!");
		return "success";
	}

	@RequestMapping("/order/addWithOrderError")
	public String OrderTransaction01(Model model) {
		Date orderDate = Calendar.getInstance().getTime();

		int orderId = sequenceService.generateNextId("northwind.order");
		List<OrderDetail> details = new ArrayList<OrderDetail>();
		for (int i = 0; i < 5; i++) {
			details.add(new OrderDetail(sequenceService
					.generateNextId("northwind.orderdetail"), orderId, i + 1,
					0.3 * (i + 1), 10 * (i + 1), (int) (Math.round(Math
							.random() * 1000)) % 100));
		}
		Order order = new Order(orderId, orderDate, new Date(
				orderDate.getTime() + 3 * 24 * 60 * 60 * 1000), new Date(
				orderDate.getTime() + 2 * 24 * 60 * 60 * 1000), "/order/addWithOrderError",
				details);

		orderService.addOrderWithOrderError(order);
		System.out.println("Spring事务测试：添加Order及明细列表OrderDetail,Order错误!");
		model.addAttribute("message",
				"Spring事务测试：添加Order及明细列表OrderDetail,Order错误!");
		return "success";
	}

	@RequestMapping("/order/addWithDetailError")
	public String OrderTransaction02(Model model) {
		Date orderDate = Calendar.getInstance().getTime();

		int orderId = sequenceService.generateNextId("northwind.order");
		List<OrderDetail> details = new ArrayList<OrderDetail>();
		for (int i = 0; i < 5; i++) {
			details.add(new OrderDetail(sequenceService
					.generateNextId("northwind.orderdetail"), orderId, i + 1,
					0.3 * (i + 1), 10 * (i + 1), (int) (Math.round(Math
							.random() * 1000)) % 100));
		}
		Order order = new Order(orderId, orderDate, new Date(
				orderDate.getTime() + 3 * 24 * 60 * 60 * 1000), new Date(
				orderDate.getTime() + 2 * 24 * 60 * 60 * 1000), "/order/addWithDetailError",
				details);

		orderService.addOrderWithDetailError(order);
		System.out.println("Spring事务测试：添加Order及明细列表OrderDetail,Detail错误!");
		model.addAttribute("message",
				"Spring事务测试：添加Order及明细列表OrderDetail,Detail错误!");
		return "success";
	}

	@RequestMapping("/order/addByTrans")
	public String OrderTransaction044(Model model) {
		Date orderDate = Calendar.getInstance().getTime();

		int orderId = sequenceService.generateNextId("northwind.order");
		List<OrderDetail> details = new ArrayList<OrderDetail>();
		for (int i = 0; i < 5; i++) {
			details.add(new OrderDetail(sequenceService
					.generateNextId("northwind.orderdetail"), orderId, i + 1,
					0.3 * (i + 1), 10 * (i + 1), (int) (Math.round(Math
							.random() * 1000)) % 100));
		}
		Order order = new Order(orderId, orderDate, new Date(
				orderDate.getTime() + 3 * 24 * 60 * 60 * 1000), new Date(
				orderDate.getTime() + 2 * 24 * 60 * 60 * 1000), "/order/add",
				details);

		orderService.addOrderByTrans(order);
		System.out.println("Spring事务测试：添加Order及明细列表OrderDetail!");
		model.addAttribute("message",
				"Spring事务测试：添加Order及明细列表OrderDetail,没有错误!");
		return "success";
	}

	@RequestMapping("/order/addWithOrderErrorByTrans")
	public String OrderTransaction05(Model model) {
		Date orderDate = Calendar.getInstance().getTime();

		int orderId = sequenceService.generateNextId("northwind.order");
		List<OrderDetail> details = new ArrayList<OrderDetail>();
		for (int i = 0; i < 5; i++) {
			details.add(new OrderDetail(sequenceService
					.generateNextId("northwind.orderdetail"), orderId, i + 1,
					0.3 * (i + 1), 10 * (i + 1), (int) (Math.round(Math
							.random() * 1000)) % 100));
		}
		Order order = new Order(orderId, orderDate, new Date(
				orderDate.getTime() + 3 * 24 * 60 * 60 * 1000), new Date(
				orderDate.getTime() + 2 * 24 * 60 * 60 * 1000), "/order/addWithOrderError",
				details);

		orderService.addOrderWithOrderErrorByTrans(order);
		System.out.println("Spring事务测试：添加Order及明细列表OrderDetail,Order错误!");
		model.addAttribute("message",
				"Spring事务测试：添加Order及明细列表OrderDetail,Order错误!");
		return "success";
	}

	@RequestMapping("/order/addWithDetailErrorByTrans")
	public String OrderTransaction06(Model model) {
		Date orderDate = Calendar.getInstance().getTime();

		int orderId = sequenceService.generateNextId("northwind.order");
		List<OrderDetail> details = new ArrayList<OrderDetail>();
		for (int i = 0; i < 5; i++) {
			details.add(new OrderDetail(sequenceService
					.generateNextId("northwind.orderdetail"), orderId, i + 1,
					0.3 * (i + 1), 10 * (i + 1), (int) (Math.round(Math
							.random() * 1000)) % 100));
		}
		Order order = new Order(orderId, orderDate, new Date(
				orderDate.getTime() + 3 * 24 * 60 * 60 * 1000), new Date(
				orderDate.getTime() + 2 * 24 * 60 * 60 * 1000), "/order/addWithDetailError",
				details);

		orderService.addOrderWithDetailErrorByTrans(order);
		System.out.println("Spring事务测试：添加Order及明细列表OrderDetail,Detail错误!");
		model.addAttribute("message",
				"Spring事务测试：添加Order及明细列表OrderDetail,Detail错误!");
		return "success";
	}
}
