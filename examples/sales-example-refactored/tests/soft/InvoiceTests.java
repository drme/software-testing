package soft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;

public class InvoiceTests {

	private List<Object> objectsToDelete = new ArrayList<Object>();
	
	public void testAddItemQuantity_severalQuantity_v1() {

		Customer customer = createTestCustomer("30");
		Product product = createTestProduct("19.99");
		Invoice invoice = createTestInvoice(customer);

		invoice.addItemQuantity(product, 5);

		assertContainsExactlyOneLineItem(product, invoice, "69.96");
	}

	private Invoice createTestInvoice(Customer customer) {
		Invoice invoice = new Invoice(customer);

		this.objectsToDelete.add(invoice);
		return invoice;
	}

	private Product createTestProduct(String price) {
		Product product = new Product(88, "SomeWidget", new BigDecimal(price));

		this.objectsToDelete.add(product);
		return product;
	}

	private Customer createTestCustomer(String discount) {
		Address billingAddress = new Address("1222 1st St SW", "Calgary",
				"Alberta", "T2N 2V2", "Canada");

		this.objectsToDelete.add(billingAddress);

		Address shippingAddress = new Address("1333 1st St SW", "Calgary",
				"Alberta", "T2N 2V2", "Canada");

		this.objectsToDelete.add(shippingAddress);

		Customer customer = new Customer(99, "John", "Doe",
				new BigDecimal(discount), billingAddress, shippingAddress);

		this.objectsToDelete.add(customer);
		return customer;
	}
	
	@After
	public void tearDown() {
		for (Object object : this.objectsToDelete) {
			try {
				// delete object..
			} catch (Throwable ex) {

			}
		}
	}

	private void assertContainsExactlyOneLineItem(Product product,
			Invoice invoice, String expectedPrice) {
		List<LineItem> lineItems = invoice.getLineItems();

		Assert.assertEquals("Invoice should have 1 item", 1, lineItems.size());
		
		
			LineItem actItem = (LineItem) lineItems.get(0);
			assertEquals("inv", invoice, actItem.getInv());
			assertEquals("prod", product, actItem.getProd());
			assertEquals("quant", 5, actItem.getQuantity());
			assertEquals("discount", new BigDecimal("30"),
					actItem.getPercentDiscount());
			assertEquals("unit price", new BigDecimal("19.99"),
					actItem.getUnitPrice());
			assertEquals("extended", expectedPrice,
					actItem.getExtendedPrice());
	}

	private void deleteObject(Address billingAddress) {
		// TODO Auto-generated method stub

	}

	private void deleteObject(Customer customer) {
		// TODO Auto-generated method stub

	}

	private void deleteObject(Product product) {
		// TODO Auto-generated method stub

	}

	private void deleteObject(Invoice invoice) {
		// TODO Auto-generated method stub

	}

}
