function send() {
    var outputData = document.getElementById("outputString")
    var formDataObj = {
        inputString: document.getElementById("inputString").value
    }

    var formData = JSON.stringify(formDataObj);
    $.ajax({
      type: "POST",
      url: "http://localhost:8095/format",
      data: formData,
      success: function(data){
        outputData.textContent = JSON.stringify(data);
      },
      error: function(data) {
        outputData.textContent = "something was wrong";
      },
      dataType: "json",
      contentType : "application/json"
    });
}



