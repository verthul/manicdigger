using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;

namespace ManicDigger
{
    /// <summary>
    /// Interface to a provider which gives the types of a mod
    /// </summary>
    internal interface IModTypesProvider
    {
        /// <summary>
        /// Get Types of a Mod
        /// </summary>
        /// <returns></returns>
        IEnumerable<Type> GetTypes();

        Assembly GetModAssembly();
    }
}
