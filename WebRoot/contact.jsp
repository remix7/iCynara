<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>iCynara | Contact</title>
		<%@ include file="/client/page/header.jspf"%>
		<script src="${pageContext.request.contextPath}/client/js/forms.js"></script>
		<script>
	jQuery(window).load(function() {
		jQuery('.spinner').animate( {
			'opacity' : 0
		}, 1000, 'easeOutCubic', function() {
			jQuery(this).css('display', 'none')
		});
	});
</script>
		<!-- content -->
		<div id="content">
			<div class="ic"></div>
			<div class="container">
				<div class="row">
					<article class="span8">
					<h3>
						Contact us
					</h3>
					<div class="inner-1">
						<form id="contact-form">
							<div class="success">
								Your message has been sent succesfuly!
								<strong> We will be in touch soon.</strong>
							</div>
							<fieldset>
								<div>
									<label class="name">
										<input type="text" value="Your name">
										<br>
										<span class="error">*This is not a valid name.</span>
										<span class="empty">*This field is required.</span>
									</label>
								</div>
								<div>
									<label class="phone">
										<input type="tel" value="Telephone">
										<br>
										<span class="error">*This is not a valid phone number.</span>
										<span class="empty">*This field is required.</span>
									</label>
								</div>
								<div>
									<label class="email">
										<input type="email" value="Email">
										<br>
										<span class="error">*This is not a valid email address.</span>
										<span class="empty">*This field is required.</span>
									</label>
								</div>
								<div>
									<label class="message">
										<textarea>Message</textarea>
										<br>
										<span class="error">*The message is too short.</span>
										<span class="empty">*This field is required.</span>
									</label>
								</div>
								<div class="buttons-wrapper">
									<a class="btn btn-1" data-type="reset">Clear</a>
									<a class="btn btn-1" data-type="submit">Send</a>
								</div>
							</fieldset>
						</form>
					</div>
					</article>
					<article class="span4">
					<h3>
						Contact info
					</h3>
					<div class="map">
						<a href="#"><img
								src="${pageContext.request.contextPath}/client/img/map.jpg"
								alt="Location on Map" />
						</a>
					</div>
					<address class="address-1">
						<strong>si<br> gao<br>
							yi</strong>
						<div class="overflow">
							<label>Mobile:<a href="#" class="mail-1">8617729916975</a></label>
							<label>Telephone:<a href="#" class="mail-1">8617729916975</a></label>
							<label>E-mail:<a href="#" class="mail-1">remix7@live.cn</a></label>
						</div>
					</address>
					</article>
				</div>
			</div>
		</div>
		</div>


		<!-- footer -->
		<%@ include file="/client/page/foot.jspf"%>