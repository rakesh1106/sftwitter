<html>
	<head>
		<title>What are you doing?</title>
		<g:javascript library="prototype"/>
	</head>
	<body>
		<div id="thinking" style="height:100%;width:100%;background-color:lightgray;display:none;"></div>
		<h1>What are you doing</h1>
		<div id="updateStatusForm">
			<g:formRemote url="[action: 'updateStatus']" update="messages" name="updateStatusForm">
				<g:textArea name="message" value=""/><br/>
				<g:submitButton name="UpdateStatus"/>
			</g:formRemote>
			<g:remoteLink url="[action: 'getRandom']" onLoaded="alert('Done');" onLoading="alert('Loading');">Click</g:remoteLink>
		</div>
	</body>
</html>
