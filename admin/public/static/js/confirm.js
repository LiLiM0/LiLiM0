Confirm = {
  show: function (message, callback) {
    Swal.fire({
      title: '删除后不可恢复，是否确认删除？',
      text: message,
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#4c87bf',
      cancelButtonColor: '#c95858',
      confirmButtonText: '确认!'
    }).then((result) => {
      if (result.value) {
        if (callback) {
          callback()
        }
      }
    })



  }
}