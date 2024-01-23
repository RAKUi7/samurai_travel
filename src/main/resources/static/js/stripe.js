const stripe = Stripe('pk_test_51OVPzkLYiINAfgxSedNbHNlKyMMug33DkSHikTAm3B7JMJ5Ox7RLteLvPa0CDzkhL0TdYjYCyDrRz5IiVg6O3Pop00LZbJnhBv');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });